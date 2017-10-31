package com.lyt.designpatterns.factory.example1;

public class FruitFactory {
    
    public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}
