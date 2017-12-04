package com.lyt.designpatterns.decorator.example3;

public class RunCar implements Car {
    
    @Override
    public void run() {
        System.out.println("run");
    }
    
    @Override
    public void show() {
        this.run();
    }
    
}
