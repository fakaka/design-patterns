package com.lyt.designpatterns.factory.demo1;

public class MainClass {
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        
        Fruit apple = FruitFactory.getFruit("com.lyt.designpatterns.factory.demo1.Apple");
        Fruit banana = FruitFactory.getFruit("com.lyt.designpatterns.factory.demo1.Banana");
        apple.getDesc();
        banana.getDesc();
    }
}
