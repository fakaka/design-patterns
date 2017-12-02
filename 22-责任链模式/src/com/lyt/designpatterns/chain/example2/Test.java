package com.lyt.designpatterns.chain.example2;

public class Test {
    
    public static void main(String[] args) {
        CarHandler headH = new CarHeadHandler();
        CarHandler bodyH = new CarBodyHandler();
        CarHandler tailH = new CarTailHandler();
        
        headH.setNextHandler(bodyH);
        bodyH.setNextHandler(tailH);
        
        headH.HandlerCar();
        
        System.out.println("---------------");
        
        bodyH.setNextHandler(headH);
        headH.setNextHandler(tailH);
        bodyH.HandlerCar();
        
        System.out.println("---------------");
        
        bodyH.setNextHandler(headH).setNextHandler(tailH);
        bodyH.HandlerCar();
        
    }
}
