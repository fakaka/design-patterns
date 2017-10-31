package com.lyt.designpatterns.template.example1;

public class Test {
    
    public static void main(String[] args) {
        HotDrink coffee = new Coffee();
        HotDrink tea = new Tea();
        
        coffee.preparwRecipe();
        tea.preparwRecipe();
    }
}
