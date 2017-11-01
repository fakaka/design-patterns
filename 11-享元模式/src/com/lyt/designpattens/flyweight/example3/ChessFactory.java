package com.lyt.designpattens.flyweight.example3;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
    
    private static Map<String, Chess> chesses = new HashMap<>();
    
    public static Chess getChess(String color) {
        Chess chess = chesses.get(color);
        if (chess == null) {
            chess = new ConcreateChess();
            chess.setColor(color);
            chesses.put(color, chess);
        }
        return chess;
    }
}
