package com.lyt.designpatterns.strategy.example2;

public class OldCustomerManyStrategy implements Strategy {
    
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice * 0.8;
    }
    
}
