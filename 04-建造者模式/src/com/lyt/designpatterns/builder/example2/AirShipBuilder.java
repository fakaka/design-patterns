package com.lyt.designpatterns.builder.example2;

public interface AirShipBuilder {
    
    Engine builderEngine();
    
    OrbitalModule builderOrbitalModule();
    
    EscapeTower builderEscapeTower();
}
