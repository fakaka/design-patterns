package com.lyt.designpattens.flyweight.example1;

public class MyCharacter {
    
    private char c;
    
    public MyCharacter(char c) {
        this.c = c;
    }
    
    public void display() {
        System.out.println(c);
    }
}
