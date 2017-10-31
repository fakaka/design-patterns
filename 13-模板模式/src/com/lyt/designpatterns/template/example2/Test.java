package com.lyt.designpatterns.template.example2;

public class Test {
    
    public static void main(String[] args) {
        MakeCar bus = new MakeBus();
        bus.make();
        
        System.out.println("-------------------");
        
        MakeCar jeep = new MakeJeep();
        jeep.make();
        
    }
}
