package com.lyt.designpatterns.strategy.example1;

public class MD5Strategy implements Strategy {
    
    @Override
    public void encrypt() {
        System.out.println("ִmd5");
    }
    
}
