package com.lyt.designpatterns.bridge.example4;

public class Test {
    
    public static void main(String[] args) {
        // 销售联想的笔记本电脑
        Computer c1 = new Laptop(new Lenovo());
        c1.sale();
        
        // 销售神舟的台式机
        Computer c2 = new Desktop(new Shenzhou());
        c2.sale();
        
    }
}
