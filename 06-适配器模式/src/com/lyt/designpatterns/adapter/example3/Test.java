package com.lyt.designpatterns.adapter.example3;

public class Test {
    
    public static void main(String[] args) {
        
        // Adapter adapter = new Adapter();
        // adapter.use18V();
        
        Adapter2 adapter = new Adapter2(new Current());
        adapter.use18V();
    }
}
