package com.lyt.designpatterns.builder.example2;

public class Test {
    
    public static void main(String[] args) {
        
        AirShipDirector director = new AirShipDirector(new HPAirShipBuilder());
        
        AirShip ship = director.directAirShip();
        
        System.out.println(ship.getEngine().getName());
        
        ship.launch();
        
    }
}
