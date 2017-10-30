package com.lyt.designpatterns.visitor.demo3;

public class VisitorB implements Visitor {
    
    @Override
    public void visit(Park park) {
        
    }
    
    @Override
    public void visit(ParkA parkA) {
        
    }
    
    @Override
    public void visit(ParkB parkB) {
        System.out.println("清洁工B:完成公园" + parkB.getName() + "的卫生");
    }
    
}
