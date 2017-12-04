package com.lyt.designpatterns.decorator.example1;

public class Decorator extends Drink {
    
    private Drink obj;
    
    public Decorator(Drink Obj) {
        this.obj = Obj;
    }
    
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }
    
    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + obj.getDescription();
    }
    
}
