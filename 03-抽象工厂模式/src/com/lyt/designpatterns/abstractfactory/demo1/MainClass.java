package com.lyt.designpatterns.abstractfactory.demo1;

public class MainClass {
    
    public static void main(String[] args) {
        // FruitFactory
        FruitFactory factory = new AppleFactory();
        
        // AppleFactory
        Fruit apple = factory.getFruit();
        apple.get();
        
        // BananaFactory
        FruitFactory factory2 = new BananaFactory();
        Fruit banana = factory2.getFruit();
        banana.get();
        
        // PearFactory
        FruitFactory factory3 = new PearFactory();
        Fruit pear = factory3.getFruit();
        pear.get();
    }
}
