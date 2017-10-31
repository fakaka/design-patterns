package com.lyt.designpatterns.visitor.example1;

import java.util.HashMap;
import java.util.Map;

public class Employees {
    
    private Map<String, Employee> employees;
    
    public Employees() {
        employees = new HashMap<>();
    }
    
    public void Attach(Employee employee) {
        employees.put(employee.getName(), employee);
    }
    
    public void Detach(Employee employee) {
        employees.remove(employee.getName());
    }
    
    public Employee getEmployee(String name) {
        return employees.get(name);
    }
    
    public void getCompensation() {
        for (Employee employee : employees.values()) {
            System.out.println(employee.getName() + "'s Compensation is " + (employee.getDegree() * employee.getVacationDays() * 100));
        }
    }
    
}
