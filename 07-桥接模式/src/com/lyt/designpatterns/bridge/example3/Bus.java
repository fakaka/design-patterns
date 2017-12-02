package com.lyt.designpatterns.bridge.example3;

public class Bus extends Car {
    
    public Bus(Engine engine) {
        super(engine);
    }
    
    @Override
    public void installEngine() {
        System.out.print("Bus：");
        getEngine().installEngine();
    }
}
