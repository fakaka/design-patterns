package com.lyt.designpatterns.decorator.example3;

public abstract class CarDecorator implements Car {
    
    private Car car;
    
    public Car getCar() {
        return car;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }
    
    public CarDecorator(Car car) {
        this.car = car;
    }
    
    @Override
    public abstract void show();
    
}
