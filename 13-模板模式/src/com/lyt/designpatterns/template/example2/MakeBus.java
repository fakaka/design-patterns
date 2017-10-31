package com.lyt.designpatterns.template.example2;

public class MakeBus extends MakeCar {
    
    @Override
    public void makeBody() {
        System.out.println("bus'body");
    }
    
    @Override
    public void makeHead() {
        System.out.println("bus'body");
    }
    
    @Override
    public void makeTail() {
        System.out.println("bus'tail");
    }
}
