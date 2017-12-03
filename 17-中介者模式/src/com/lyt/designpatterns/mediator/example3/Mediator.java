package com.lyt.designpatterns.mediator.example3;

public interface Mediator {
    
    void register(String dname, Department department);
    
    void command(String dname);
    
}
