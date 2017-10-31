package com.lyt.designpatterns.factory.example2;

/**
 * 简单工厂情况下
 * 
 * @author MJ
 *
 */
public class Test2 {   // 调用者
    
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");
        
        c1.run();
        c2.run();
        
    }
}
