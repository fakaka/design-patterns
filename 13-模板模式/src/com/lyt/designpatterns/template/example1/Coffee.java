package com.lyt.designpatterns.template.example1;

public class Coffee extends HotDrink {
    
    @Override
    public void addCondiments() {
        System.out.println("加糖");
    }
    
    @Override
    public void brew() {
        System.out.println("泡");
    }
    
}
