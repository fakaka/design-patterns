package com.lyt.designpatterns.factory.demo1;

public class FruitFactory {
    
    public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}
