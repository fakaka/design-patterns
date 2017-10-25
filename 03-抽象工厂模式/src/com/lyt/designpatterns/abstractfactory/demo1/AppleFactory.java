package com.lyt.designpatterns.abstractfactory.demo1;

public class AppleFactory implements FruitFactory {
    
    /**
     * 在具体的子类中创建实例
     * 
     */
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
    
}
