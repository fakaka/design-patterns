package com.lyt.designpatterns.mediator.example2;

public class Alarm extends Colleague {
    
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }
    
    public void SendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
    
    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
    
}
