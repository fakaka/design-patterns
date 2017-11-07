package com.lyt.designpatterns.builder.example2;

public class AirShipDirector {
    
    private AirShipBuilder builder;
    
    public AirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }
    
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();
        
        // 装配飞船
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        
        return ship;
    }
    
}
