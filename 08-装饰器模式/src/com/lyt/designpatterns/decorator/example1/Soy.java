package com.lyt.designpatterns.decorator.example1;

public class Soy extends Decorator {
    
    public Soy(Drink obj) {
        super(obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }
    
}
