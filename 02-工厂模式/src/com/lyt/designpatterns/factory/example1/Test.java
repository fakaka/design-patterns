package com.lyt.designpatterns.factory.example1;

public class Test {
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        
        Fruit apple = FruitFactory.getFruit("com.lyt.designpatterns.factory.demo1.Apple");
        Fruit banana = FruitFactory.getFruit("com.lyt.designpatterns.factory.demo1.Banana");
        apple.getDesc();
        banana.getDesc();
    }
}
