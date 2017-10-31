package com.lyt.designpatterns.factory.example2;

/**
 * 简单工厂类
 * 
 * @author MJ
 *
 */
public class CarFactory2 {
    
    public static Car createAudi() {
        return new Audi();
    }
    
    public static Car createByd() {
        return new Byd();
    }
    
}
