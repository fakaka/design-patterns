package com.lyt.designpatterns.visitor.demo3;

public class Park extends ParkElement {
    
    private ParkA parkA;
    
    private ParkB parkB;
    
    public Park() {
        this.parkA = new ParkA();
        this.parkB = new ParkB();
        parkA.setName("A");
        parkB.setName("B");
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        parkA.accept(visitor);
        parkB.accept(visitor);
    }
}
