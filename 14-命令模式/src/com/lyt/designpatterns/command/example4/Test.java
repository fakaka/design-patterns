package com.lyt.designpatterns.command.example4;

public class Test {
    
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoke invoke = new Invoke(command);
        invoke.call();
    }
}
