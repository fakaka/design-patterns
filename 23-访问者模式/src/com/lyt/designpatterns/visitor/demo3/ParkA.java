package com.lyt.designpatterns.visitor.demo3;

public class ParkA extends ParkElement {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
