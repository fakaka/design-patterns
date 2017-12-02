package com.lyt.designpatterns.bridge.example3;

public class Engine2000 implements Engine {
    
    @Override
    public void installEngine() {
        System.out.println("安装2000发动机");
    }
    
}
