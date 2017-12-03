package com.lyt.designpatterns.abstractfactory.example1;

public class LuxuryCarFactory implements CarFactory {
    
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }
    
    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }
    
    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
    
}
