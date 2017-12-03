package com.lyt.designpatterns.strategy.example1;

public class SHA1Strategy implements Strategy {
    
    @Override
    public void encrypt() {
        System.out.println("sha1");
    }
    
}
