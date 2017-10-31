package com.lyt.designpatterns.visitor.example2;

public class Test {
    
    public static void main(String[] args) {
        Employees mEmployees = new Employees();
        
        mEmployees.attach(new Employee("Tom", 4500, 8, 1));
        mEmployees.attach(new Employee("Jerry", 6500, 10, 2));
        mEmployees.attach(new Employee("Jack", 9600, 12, 3));
        
        mEmployees.accept(new CompensationVisitor());
    }
}
