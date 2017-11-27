package com.lyt.designpatterns.adapter.example1;

public class Test {
    
    public static void main(String[] args) {
        
        GreenHeadDuck duck = new GreenHeadDuck();
        
        WildTurkey turkey = new WildTurkey();
        
        Duck duck2turkeyAdapter = new TurkeyAdapter(turkey);
        
        turkey.gobble();
        turkey.fly();
        
        duck.quack();
        duck.fly();
        
        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();
    }
}
