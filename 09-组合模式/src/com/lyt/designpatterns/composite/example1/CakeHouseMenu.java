package com.lyt.designpatterns.composite.example1;

import java.util.ArrayList;
import java.util.Iterator;

public class CakeHouseMenu extends MenuComponent {
    
    private ArrayList<MenuComponent> menuItems;
    
    public CakeHouseMenu() {
        menuItems = new ArrayList<>();
        
        addItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
        addItem("MDL Cake Breakfast", "fried eggs&toast", false, 3.59f);
        addItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
        addItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);
    }
    
    private void addItem(String name, String description, boolean vegetable, float price) {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }
    
    @Override
    public Iterator<MenuComponent> getIterator() {
        return new ComposeIterator(menuItems.iterator());
    }
    
    @Override
    public void print() {
        System.out.println("****This is CakeHouseMenu****");
    }
    
    // 其他功能代码
    
}
