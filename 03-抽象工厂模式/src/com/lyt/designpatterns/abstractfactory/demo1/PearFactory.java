package com.lyt.designpatterns.abstractfactory.demo1;

public class PearFactory implements FruitFactory {
    
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
