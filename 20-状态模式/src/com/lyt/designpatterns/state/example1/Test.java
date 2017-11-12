package com.lyt.designpatterns.state.example1;

public class Test {
    
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(1);
        
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
