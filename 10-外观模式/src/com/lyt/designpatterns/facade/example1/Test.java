package com.lyt.designpatterns.facade.example1;

public class Test {
    
    public static void main(String[] args) {
        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();
        
        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
    
}
