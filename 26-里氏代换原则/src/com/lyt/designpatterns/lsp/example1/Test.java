package com.lyt.designpatterns.lsp.example1;

public class Test {
    
    public static void main(String[] args) {
        Person person = new Person();
        Man man = new Man();
        display(man);
    }
    
    public static void display(Man man) {
        man.display();
    }
}
