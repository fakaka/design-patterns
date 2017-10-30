package com.lyt.designpatterns.visitor.demo1;

/**
 * 这不是访问者模式
 * 
 * @author MJ
 *
 */
public class Test {
    
    public static void main(String[] args) {
        Employees mEmployees = new Employees();
        
        mEmployees.Attach(new Employee("Tom", 4500, 8, 1));
        mEmployees.Attach(new Employee("Jerry", 6500, 10, 2));
        mEmployees.Attach(new Employee("Jack", 9600, 12, 3));
        mEmployees.getCompensation();
    }
    
}
