package com.lyt.designpatterns.composite.example1;

import java.util.Iterator;
import java.util.Stack;

public class ComposeIterator implements Iterator<MenuComponent> {
    
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();
    
    public ComposeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }
    
    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        if (iterator.hasNext()) {
            return true;
        }
        stack.pop();
        return hasNext();
        
    }
    
    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            stack.push(menuComponent.getIterator());
            return menuComponent;
        }
        return null;
    }
    
    @Override
    public void remove() {
        
    }
    
}
