package com.lyt.designpatterns.composite.example1;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    
    private ArrayList<MenuComponent> iterators = new ArrayList<>();
    
    public Waitress() {}
    
    public void addComponent(MenuComponent mMenuComponent) {
        iterators.add(mMenuComponent);
    }
    
    public void printMenu() {
        Iterator<MenuComponent> iterator;
        MenuComponent menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            iterators.get(i).print();
            iterator = iterators.get(i).getIterator();
            
            while (iterator.hasNext()) {
                menuItem = iterator.next();
                menuItem.print();
            }
        }
    }
    
    public void printBreakfastMenu() {
        
    }
    
    public void printLunchMenu() {
        
    }
    
    public void printVegetableMenu() {
        
        Iterator<MenuComponent> iterator;
        MenuComponent menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            iterators.get(i).print();
            iterator = iterators.get(i).getIterator();
            while (iterator.hasNext()) {
                menuItem = iterator.next();
                if (menuItem.isVegetable()) {
                    menuItem.print();
                }
            }
        }
    }
}
