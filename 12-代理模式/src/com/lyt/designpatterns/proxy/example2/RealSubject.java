package com.lyt.designpatterns.proxy.example2;

public class RealSubject implements Subject {
    
    @Override
    public void sailBook() {
        System.out.println("卖书");
    }
    
}
