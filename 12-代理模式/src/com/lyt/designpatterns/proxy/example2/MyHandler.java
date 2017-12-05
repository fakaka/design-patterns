package com.lyt.designpatterns.proxy.example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    
    private RealSubject realSubject;
    
    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result = null;
        dazhe();
        try {
            result = method.invoke(realSubject, args);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        give();
        return result;
    }
    
    public void dazhe() {
        System.out.println("打折");
    }
    
    public void give() {
        System.out.println("给钱");
    }
    
}
