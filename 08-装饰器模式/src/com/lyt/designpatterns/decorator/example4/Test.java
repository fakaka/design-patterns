package com.lyt.designpatterns.decorator.example4;

public class Test {
    
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        
        System.out.println("----------增加新的功能，飞行----------");
        FlyCar flycar = new FlyCar(car);
        flycar.move();
        
        System.out.println("----------增加新的功能，水里游---------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();
        
        System.out.println("----------增加两个新的功能，飞行，水里游-------");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();
        
        System.out.println("----------AI-------");
        
        AICar aiCar = new AICar(new WaterCar(new FlyCar(new Car())));
        aiCar.move();
    }
}
