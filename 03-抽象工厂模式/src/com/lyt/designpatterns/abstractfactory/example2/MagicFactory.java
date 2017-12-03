package com.lyt.designpatterns.abstractfactory.example2;

public class MagicFactory extends AbstractFactory {
    
    @Override
    public Food createFood() {
        return new MushRoom();
    }
    
    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }
    
    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
    
}
