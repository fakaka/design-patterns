package com.lyt.designpatterns.strategy.example2;

public class Test {
    
    public static void main(String[] args) {
        
        Context ctx = new Context(new OldCustomerManyStrategy());
        
        ctx.pringPrice(998);
        
    }
}
