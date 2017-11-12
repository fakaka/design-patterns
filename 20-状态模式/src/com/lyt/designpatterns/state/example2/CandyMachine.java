package com.lyt.designpatterns.state.example2;

public class CandyMachine {
    
    State soldOutState;
    
    State onReadyState;
    
    State hasCoin;
    
    State soldState;
    
    State winnerState;
    
    private State state;
    
    private int count = 0;
    
    public CandyMachine(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        onReadyState = new OnReadyState(this);
        hasCoin = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        
        state = count > 0 ? onReadyState : soldOutState;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void insertCoin() {
        state.insertCoin();
    }
    
    public void returnCoin() {
        state.returnCoin();
    }
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    
    void releaseCandy() {
        if (count > 0) {
            count--;
            System.out.println("a candy rolling out!");
        }
    }
    
    public int getCount() {
        return count;
    }
    
    public void printstate() {
        state.printState();
    }
}
