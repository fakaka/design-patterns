package com.lyt.designpatterns.state.example3;

public class Test {
    
    public static void main(String[] args) {
        Person person = new Person();
        
        person.setHour(7);
        person.doSomething();
        
        person.setHour(12);
        person.doSomething();
        
        person.setHour(18);
        person.doSomething();
        
        person.setHour(8);
        person.doSomething();
    }
}
