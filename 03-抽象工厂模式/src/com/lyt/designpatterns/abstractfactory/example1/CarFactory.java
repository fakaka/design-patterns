package com.lyt.designpatterns.abstractfactory.example1;

public interface CarFactory {
    
    Engine createEngine();
    
    Seat createSeat();
    
    Tyre createTyre();
    
}
