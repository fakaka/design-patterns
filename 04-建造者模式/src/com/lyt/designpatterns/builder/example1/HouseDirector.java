package com.lyt.designpatterns.builder.example1;

public class HouseDirector {
    
    // private HouseBuilder builder;
    //
    // public HouseDirector(HouseBuilder builder) {
    // this.builder = builder;
    // }
    
    public void makeHouse(HouseBuilder builder) {
        builder.makeFloor();
        builder.makeWall();
        builder.makeHousetop();
    }
    
}
