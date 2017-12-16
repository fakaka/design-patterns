package com.lyt.designpatterns.composite.example1;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public MenuComponent next() {
        return null;
    }
    
    @Override
    public void remove() {
        
    }
    
}
