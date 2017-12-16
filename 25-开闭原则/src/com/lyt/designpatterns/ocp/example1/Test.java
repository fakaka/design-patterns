package com.lyt.designpatterns.ocp.example1;

public class Test {
    
    public static void main(String[] args) {
        BankWorker bankWorker = new BankWorker();
        
        bankWorker.saving();
        
        bankWorker.drawing();
        
        bankWorker.zhuanzhang();
        
        bankWorker.jijin();
    }
}
