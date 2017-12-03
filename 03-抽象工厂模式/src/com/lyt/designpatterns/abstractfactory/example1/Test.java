package com.lyt.designpatterns.abstractfactory.example1;

public class Test {
    
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
    }
    
}
