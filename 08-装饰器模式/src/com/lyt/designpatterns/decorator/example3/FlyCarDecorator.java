package com.lyt.designpatterns.decorator.example3;

public class FlyCarDecorator extends CarDecorator {
    
    public FlyCarDecorator(Car car) {
        super(car);
    }
    
    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }
    
    public void fly() {
        System.out.println("fly");
    }
    
    @Override
    public void run() {}
}
