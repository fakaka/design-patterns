package com.lyt.designpatterns.visitor.example3;

public class ParkA extends ParkElement {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
