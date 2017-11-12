package com.lyt.designpatterns.state.example5;

public class Test {
    
    public static void main(String[] args) {
        HomeContext ctx = new HomeContext();
        
        ctx.setState(new FreeState());
        ctx.doSth();
        ctx.setState(new BookedState());
        ctx.doSth();
    }
}
