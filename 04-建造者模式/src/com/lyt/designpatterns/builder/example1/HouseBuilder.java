package com.lyt.designpatterns.builder.example1;

public interface HouseBuilder {
    
    public void makeFloor();
    
    public void makeWall();
    
    public void makeHousetop();
    
    public House buildHouse();
}
