package com.lyt.designpatterns.visitor.demo3;

public abstract class ParkElement {
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void accept(Visitor visitor);
}
