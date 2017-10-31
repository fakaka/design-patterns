package com.lyt.designpatterns.factorymethod.example2;

public class BananaFactory implements FruitFactory {
    
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
    
}
