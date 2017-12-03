package com.lyt.designpatterns.abstractfactory.example2;

public abstract class AbstractFactory {
    
    public abstract Vehicle createVehicle();
    
    public abstract Weapon createWeapon();
    
    public abstract Food createFood();
    
}
