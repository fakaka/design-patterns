package com.lyt.designpatterns.visitor.demo2;

import java.util.HashMap;
import java.util.Map;

public class Employees {
    
    private Map<String, Employee> employees;
    
    public Employees() {
        employees = new HashMap<>();
    }
    
    public void attach(Employee employee) {
        employees.put(employee.getName(), employee);
    }
    
    public void detach(Employee employee) {
        employees.remove(employee.getName());
    }
    
    public Employee getEmployee(String name) {
        return employees.get(name);
    }
    
    public void accept(Visitor visitor) {
        for (Employee e : employees.values()) {
            e.accept(visitor);
        }
    }
    
}
