package com.lyt.designpatterns.facade.example2;

public class Test {
    
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doAB();
        facade.doABC();
    }
    
}
