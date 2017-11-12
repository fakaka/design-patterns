package com.lyt.designpatterns.state.example3;

public class NoState extends State {
    
    @Override
    public void doSomething() {
        System.out.println("休息");
    }
    
}
