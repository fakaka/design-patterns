package com.lyt.designpatterns.template.example2;

public abstract class MakeCar {
    
    public void make() {
        makeHead();
        makeBody();
        makeTail();
        run();
    }
    
    public abstract void makeHead();
    
    public abstract void makeBody();
    
    public abstract void makeTail();
    
    public void run() {
        System.out.println("run");
    }
}
