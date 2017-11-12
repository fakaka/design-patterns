package com.lyt.designpatterns.state.example1;

public class CandyMachine {
    
    final static int SOLD_OUT_STATE = 0;
    
    final static int ON_READY_STATE = 1;
    
    final static int HAS_COIN = 2;
    
    final static int SOLD_STATE = 3;
    
    private int state = SOLD_OUT_STATE;
    
    private int count = 0;
    
    public CandyMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = ON_READY_STATE;
        }
    }
    
    public void insertCoin() {
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("you can't insert coin,the machine sold out!");
                break;
            case ON_READY_STATE:
                state = HAS_COIN;
                System.out.println("you have inserted a coin,next,please turn crank!");
                break;
            case HAS_COIN:
                System.out.println("you can't insert another coin!");
                break;
            case SOLD_STATE:
                System.out.println("please wait!we are giving you a candy!");
                break;
        }
        
    }
    
    public void returnCoin() {
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("you can't return,you haven't inserted a coin yet!");
                break;
            case ON_READY_STATE:
                System.out.println("you haven't inserted a coin yet!");
                break;
            case HAS_COIN:
                System.out.println("coin return!");
                state = ON_READY_STATE;
                break;
            case SOLD_STATE:
                System.out.println("sorry,you already have turned the crank!");
                break;
        }
        
    }
    
    public void turnCrank() {
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("you turned,but there are no candies!");
                break;
            case ON_READY_STATE:
                System.out.println("you turned,but you haven't inserted a coin!");
                break;
            case HAS_COIN:
                System.out.println("crank turn...!");
                state = SOLD_STATE;
                dispense();
                break;
            case SOLD_STATE:
                System.out.println("we are giving you a candy,turning another get nothing,!");
                break;
        }
        
    }
    
    private void dispense() {
        count = count - 1;
        System.out.println("a candy rolling out!");
        if (count > 0) {
            state = ON_READY_STATE;
        }
        else {
            System.out.println("Oo,out of candies");
            state = SOLD_OUT_STATE;
        }
        
    }
    
    public void printstate() {
        
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("***SoldOutState***");
                break;
            case ON_READY_STATE:
                System.out.println("***OnReadyState***");
                break;
            case HAS_COIN:
                System.out.println("***HasCoin***");
                break;
            case SOLD_STATE:
                System.out.println("***SoldState***");
                break;
        }
        
    }
}
