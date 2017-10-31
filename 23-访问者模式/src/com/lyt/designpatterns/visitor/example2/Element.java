package com.lyt.designpatterns.visitor.example2;

public abstract class Element {
    
    abstract void accept(Visitor visitor);
}
