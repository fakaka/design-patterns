package com.lyt.designpattens.flyweight.example3;

public class Test {
    
    public static void main(String[] args) {
        
        Chess chess1 = ChessFactory.getChess("black");
        Chess chess2 = ChessFactory.getChess("black");
        System.out.println(chess1 == chess2);
        
        chess1.display(new Coordinate(0, 0));
        chess2.display(new Coordinate(10, 20));
    }
}
