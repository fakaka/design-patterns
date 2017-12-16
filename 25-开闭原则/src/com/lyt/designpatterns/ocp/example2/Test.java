package com.lyt.designpatterns.ocp.example2;

public class Test {
    
    public static void main(String[] args) {
        BankWorker bankWorker = new SavingBankWorker();
        bankWorker.operation();
        
        BankWorker bankWorker2 = new DrawingBankWorker();
        bankWorker2.operation();
        
        BankWorker bankWorker3 = new ZhuanZhangBankWorker();
        bankWorker3.operation();
        
        BankWorker bankWorker4 = new JiJinBankWorker();
        bankWorker4.operation();
    }
    
}
