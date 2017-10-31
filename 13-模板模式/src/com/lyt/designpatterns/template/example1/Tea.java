package com.lyt.designpatterns.template.example1;

public class Tea extends HotDrink {
    
    @Override
    public void addCondiments() {
        System.out.println("加茶叶");
    }
    
    @Override
    public void brew() {
        System.out.println("泡");
    }
    
}
