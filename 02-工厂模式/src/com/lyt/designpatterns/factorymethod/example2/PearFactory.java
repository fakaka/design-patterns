package com.lyt.designpatterns.factorymethod.example2;

public class PearFactory implements FruitFactory {
    
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
