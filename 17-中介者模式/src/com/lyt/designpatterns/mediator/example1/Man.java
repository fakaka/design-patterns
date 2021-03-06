package com.lyt.designpatterns.mediator.example1;

public class Man extends Person {
    
    public Man(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }
    
    @Override
    public void getPartner(Person person) {
        this.getMediator().setMan(this);
        this.getMediator().getPartner(person);
    }
}
