package com.lyt.designpatterns.proxy.example1;

public class ProxySubject implements Subject {
    
    private RealSubject realSubject = new RealSubject();
    
    @Override
    public void sailBook() {
        dazhe();
        realSubject.sailBook();
        give();
    }
    
    public void dazhe() {
        System.out.println("打折");
    }
    
    public void give() {
        System.out.println("给钱");
    }
}
