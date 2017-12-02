package com.lyt.designpatterns.mediator.example2;

public interface Mediator {
    
    public abstract void register(String colleagueName, Colleague colleague);
    
    public abstract void getMessage(int stateChange, String colleagueName);
    
    public abstract void sendMessage();
}
