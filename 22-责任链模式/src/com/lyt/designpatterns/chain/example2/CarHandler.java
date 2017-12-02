package com.lyt.designpatterns.chain.example2;

public abstract class CarHandler {
    
    protected CarHandler nextCarHandler;
    
    public CarHandler setNextHandler(CarHandler carHandler) {
        this.nextCarHandler = carHandler;
        return this.nextCarHandler;
    }
    
    public abstract void HandlerCar();
    
}
