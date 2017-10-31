package com.lyt.designpatterns.template.example2;

public class MakeJeep extends MakeCar {
    
    @Override
    public void makeBody() {
        System.out.println("jeep'body");
    }
    
    @Override
    public void makeHead() {
        System.out.println("jeep'head");
    }
    
    @Override
    public void makeTail() {
        System.out.println("jeep'tail");
    }
    
}
