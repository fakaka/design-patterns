package com.lyt.designpatterns.decorator.example3;

public class SwimCarDecorator extends CarDecorator {
    
    public SwimCarDecorator(Car car) {
        super(car);
    }
    
    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }
    
    public void swim() {
        System.out.println("swim");
    }
    
    @Override
    public void run() {
        
    }
    
}
