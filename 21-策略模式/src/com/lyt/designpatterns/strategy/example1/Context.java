package com.lyt.designpatterns.strategy.example1;

public class Context {
    
    private Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void encrypt() {
        strategy.encrypt();
    }
}
