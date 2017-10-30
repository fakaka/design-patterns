package com.lyt.designpatterns.visitor.demo2;

public abstract class Element {
    
    abstract void accept(Visitor visitor);
}
