package com.lyt.designpatterns.adapter.example3;

/**
 * 对象适配器
 * 
 * @author MJ
 *
 */
public class Adapter extends Current {
    
    public void use18V() {
        System.out.println("使用适配器");
        use220V();
    }
    
}
