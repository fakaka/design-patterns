package com.lyt.designpatterns.builder.example1;

public class PingFangBuilder implements HouseBuilder {
    
    private House house;
    
    public PingFangBuilder() {
        house = new House();
    }
    
    @Override
    public void makeFloor() {
        house.setFloor("平房的地板");
    }
    
    @Override
    public void makeHousetop() {
        house.setHousetop("平房的屋顶");
    }
    
    @Override
    public void makeWall() {
        house.setWall("平房的墙");
    }
    
    @Override
    public House buildHouse() {
        return house;
    }
    
}
