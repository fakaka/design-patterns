package com.lyt.designpatterns.proxy.example2;

import java.lang.reflect.Proxy;

public class Test {
    
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        MyHandler myHandler = new MyHandler();
        myHandler.setRealSubject(realSubject);
        
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(),
                myHandler);
        proxySubject.sailBook();
    }
}
