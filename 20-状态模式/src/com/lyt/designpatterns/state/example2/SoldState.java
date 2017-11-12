package com.lyt.designpatterns.state.example2;

public class SoldState implements State {
    
    private CandyMachine candyMachine;
    
    public SoldState(CandyMachine mCandyMachine) {
        this.candyMachine = mCandyMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("please wait!we are giving you a candy!");
    }
    
    @Override
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("we are giving you a candy,turning another get nothing,!");
    }
    
    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        
        if (candyMachine.getCount() > 0) {
            candyMachine.setState(candyMachine.onReadyState);
        }
        else {
            System.out.println("Oo, out of candies");
            candyMachine.setState(candyMachine.soldOutState);
        }
    }
    
    @Override
    public void printState() {
        System.out.println("***SoldState***");
    }
    
}
