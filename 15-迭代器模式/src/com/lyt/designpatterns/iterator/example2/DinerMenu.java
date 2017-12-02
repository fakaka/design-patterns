package com.lyt.designpatterns.iterator.example2;

import java.util.Iterator;

public class DinerMenu {
    
    private final static int MAX_ITEMS = 5;
    
    private int numberOfItems = 0;
    
    private MenuItem[] menuItems;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
        addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
        addItem("bean soup", "bean&potato salad", true, 3.28f);
        addItem("hotdog", "onions&cheese&bread", false, 3.05f);
        
    }
    
    private void addItem(String name, String description, boolean vegetable, float price) {
        
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("sorry,menu is full!can not add another item");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
        
    }
    
    public Iterator<MenuItem> getIterator() {
        return new DinerIterator();
    }
    
    class DinerIterator implements Iterator<MenuItem> {
        
        private int position = 0;
        
        @Override
        public boolean hasNext() {
            if (position < numberOfItems) {
                return true;
            }
            position = 0;
            return false;
        }
        
        @Override
        public MenuItem next() {
            return menuItems[position++];
        }
        
        @Override
        public void remove() {
            
        }
        
    }
}
