package com.lyt.designpatterns.chain.example2;

public class CarTailHandler extends CarHandler {
    
    @Override
    public void HandlerCar() {
        System.out.println("车尾");
        if (this.nextCarHandler != null) {
            this.nextCarHandler.HandlerCar();
        }
    }
    
}
