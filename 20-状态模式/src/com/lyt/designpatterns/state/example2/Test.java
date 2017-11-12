package com.lyt.designpatterns.state.example2;

public class Test {
    
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);
        
        mCandyMachine.printstate();
        
        mCandyMachine.insertCoin();
        mCandyMachine.printstate();
        
        mCandyMachine.turnCrank();
        
        mCandyMachine.printstate();
        
        mCandyMachine.insertCoin();
        mCandyMachine.printstate();
        
        mCandyMachine.turnCrank();
        
        mCandyMachine.printstate();
    }
}
