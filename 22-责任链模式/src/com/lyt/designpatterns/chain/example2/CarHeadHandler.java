package com.lyt.designpatterns.chain.example2;

public class CarHeadHandler extends CarHandler {
    
    @Override
    public void HandlerCar() {
        System.out.println("车头");
        if (this.nextCarHandler != null) {
            this.nextCarHandler.HandlerCar();
        }
    }
    
}
