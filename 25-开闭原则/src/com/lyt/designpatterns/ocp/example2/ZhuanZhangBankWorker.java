package com.lyt.designpatterns.ocp.example2;

public class ZhuanZhangBankWorker implements BankWorker {
    
    @Override
    public void operation() {
        System.out.println("ZhuanZhang");
    }
    
}
