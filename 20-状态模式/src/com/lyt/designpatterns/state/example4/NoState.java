package com.lyt.designpatterns.state.example4;

public class NoState extends State {
    
    @Override
    public void doSomething(Person person) {
        System.out.println(person.getHour() + "点休息");
    }
    
}
