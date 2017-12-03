package com.lyt.designpatterns.strategy.example2;

public class NewCustomerFewStrategy implements Strategy {
    
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价");
        return standardPrice;
    }
    
}
