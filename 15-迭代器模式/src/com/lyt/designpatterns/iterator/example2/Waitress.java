package com.lyt.designpatterns.iterator.example2;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    
    private ArrayList<Iterator<MenuItem>> iterators = new ArrayList<>();
    
    public Waitress() {
        
    }
    
    public void addIterator(Iterator<MenuItem> iterator) {
        iterators.add(iterator);
    }
    
    public void printMenu() {
        MenuItem menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            Iterator<MenuItem> iterator = iterators.get(i);
            while (iterator.hasNext()) {
                menuItem = iterator.next();
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
