package com.lyt.designpatterns.composite.example1;

import java.util.Iterator;

public abstract class MenuComponent {
    
    public String getName() {
        return "";
    }
    
    public String getDescription() {
        return "";
    }
    
    public float getPrice() {
        return 0;
    }
    
    public boolean isVegetable() {
        return false;
    }
    
    public abstract void print();
    
    public Iterator<MenuComponent> getIterator() {
        return new NullIterator();
    }
}
