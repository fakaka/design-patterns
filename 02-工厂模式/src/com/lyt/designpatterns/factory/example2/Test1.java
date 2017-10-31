package com.lyt.designpatterns.factory.example2;

/**
 * 测试在没有工厂模式的情况下
 * 
 * @author MJ
 *
 */
public class Test1 {   // 调用者
    
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();
        
        c1.run();
        c2.run();
        
    }
}
