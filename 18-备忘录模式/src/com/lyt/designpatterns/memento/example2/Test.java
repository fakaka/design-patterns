package com.lyt.designpatterns.memento.example2;

public class Test {
    
    public static void main(String[] args) {
        Person person = new Person("lifengxing", "男", 24);
        
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(person.createMemento());
        person.display();
        
        person.setName("beifeng");
        person.setSex("男");
        person.setAge(1);
        person.display();
        
        person.setMemento(caretaker.getMemento());
        person.display();
        
    }
}
