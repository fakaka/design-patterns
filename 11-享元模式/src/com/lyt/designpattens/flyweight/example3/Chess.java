package com.lyt.designpattens.flyweight.example3;

public interface Chess {
    
    void setColor(String color);
    
    String getColor();
    
    void display(Coordinate c);
    
}

class ConcreateChess implements Chess {
    
    private String color;
    
    @Override
    public void setColor(String color) {
        this.color = color;
        
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    @Override
    public void display(Coordinate c) {
        System.out.print(color + " ");
        System.out.println(c);
    }
    
}
