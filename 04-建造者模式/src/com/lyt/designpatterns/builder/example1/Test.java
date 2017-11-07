package com.lyt.designpatterns.builder.example1;

public class Test {
    
    public static void main(String[] args) {
        
        // HouseBuilder builder2 = new GongyuBuilder();
        HouseBuilder builder = new PingFangBuilder();
        HouseDirector director = new HouseDirector();
        director.makeHouse(builder);
        House house = builder.buildHouse();
        
        System.out.println(house.getFloor());
        System.out.println(house.getWall());
        System.out.println(house.getHousetop());
    }
    
}
