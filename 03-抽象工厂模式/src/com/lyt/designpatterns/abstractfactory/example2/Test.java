package com.lyt.designpatterns.abstractfactory.example2;

public class Test {
    
    public static void main(String[] args) {
        
        // AbstractFactory f = new DefaultFactory();
        AbstractFactory f = new MagicFactory();
        
        Vehicle vehicle = f.createVehicle();
        vehicle.run();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
        Food food = f.createFood();
        food.printName();
    }
}
