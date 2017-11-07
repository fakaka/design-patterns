package com.lyt.designpatterns.builder.example1;

public class GongyuBuilder implements HouseBuilder {
    
    House house = new House();
    
    @Override
    public void makeFloor() {
        house.setFloor("公寓的地板");
    }
    
    @Override
    public void makeHousetop() {
        house.setHousetop("公寓的屋顶");
    }
    
    @Override
    public void makeWall() {
        house.setWall("公寓的墙");
    }
    
    @Override
    public House buildHouse() {
        return house;
    }
    
}
