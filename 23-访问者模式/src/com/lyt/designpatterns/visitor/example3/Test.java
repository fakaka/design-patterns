package com.lyt.designpatterns.visitor.example3;

public class Test {
    
    public static void main(String[] args) {
        Park park = new Park();
        park.setName("古林公园");
        
        park.accept(new VisitorA());
        
        park.accept(new VisitorB());
        
        park.accept(new VisitorManager());
    }
}
