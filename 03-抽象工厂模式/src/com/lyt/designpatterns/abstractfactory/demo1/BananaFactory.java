package com.lyt.designpatterns.abstractfactory.demo1;

public class BananaFactory implements FruitFactory {
    
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
    
}
