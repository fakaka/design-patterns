package com.lyt.designpatterns.iterator.example1;

import java.util.ArrayList;

public class CakeHouseMenu {
    
    private ArrayList<MenuItem> menuItems;
    
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
    
    public Iterator getIterator() {
        return new CakeHouseIterator();
    }
    
    class CakeHouseIterator implements Iterator {
        
        private int position = 0;
        
        public CakeHouseIterator() {
            position = 0;
        }
        
        @Override
        public boolean hasNext() {
            return position < menuItems.size();
        }
        
        @Override
        public Object next() {
            return menuItems.get(position++);
        }
    };
    // 其他功能代码
    
}
