package com.lyt.designpatterns.ocp.example2;

public class DrawingBankWorker implements BankWorker {
    
    @Override
    public void operation() {
        System.out.println("Drawing");
    }
    
}
