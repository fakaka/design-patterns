package com.lyt.designpatterns.command.example3;

public class Test {
    
    public static void main(String[] args) {
        Peddler peddler = new Peddler();
        
        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);
        Waiter waiter = new Waiter();
        
        waiter.setOrder(appleCommand);
        waiter.setOrder(bananaCommand);
        
        waiter.removeOrder(appleCommand);
        
        waiter.sell();
    }
}
