package com.lyt.designpatterns.visitor.example3;

public class ParkB extends ParkElement {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
