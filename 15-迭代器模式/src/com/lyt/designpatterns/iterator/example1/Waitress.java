package com.lyt.designpatterns.iterator.example1;

import java.util.ArrayList;

public class Waitress {
    
    private ArrayList<Iterator> iterators = new ArrayList<>();
    
    public Waitress() {}
    
    public void addIterator(Iterator iterator) {
        iterators.add(iterator);
    }
    
    public void printMenu() {
        MenuItem menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            Iterator iterator = iterators.get(i);
            
            while (iterator.hasNext()) {
                menuItem = (MenuItem) iterator.next();
                System.out.println(menuItem.getName() + "***" + menuItem.getPrice() + "***" + menuItem.getDescription());
            }
            
        }
    }
    
    public void printBreakfastMenu() {
        
    }
    
    public void printLunchMenu() {
        
    }
    
    public void printVegetableMenu() {
        
    }
}
