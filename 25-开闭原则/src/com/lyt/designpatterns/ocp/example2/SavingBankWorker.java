package com.lyt.designpatterns.ocp.example2;

public class SavingBankWorker implements BankWorker {
    
    @Override
    public void operation() {
        System.out.println("Saving");
    }
    
}
