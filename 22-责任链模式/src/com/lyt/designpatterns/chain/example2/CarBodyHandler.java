package com.lyt.designpatterns.chain.example2;

public class CarBodyHandler extends CarHandler {
    
    @Override
    public void HandlerCar() {
        System.out.println("车身");
        if (this.nextCarHandler != null) {
            this.nextCarHandler.HandlerCar();
        }
    }
    
}
