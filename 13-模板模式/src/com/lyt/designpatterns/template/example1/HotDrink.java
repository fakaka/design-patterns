package com.lyt.designpatterns.template.example1;

public abstract class HotDrink {
    
    public final void preparwRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    public void boilWater() {
        System.out.println("烧水");
    }
    
    public abstract void addCondiments();
    
    public void pourInCup() {
        System.out.println("导入杯子");
    }
    
    public abstract void brew();
}
