package com.lyt.designpattens.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
    
    private Map<Character, MyCharacter> pool;
    
    public MyCharacterFactory() {
        pool = new HashMap<>();
    }
    
    public MyCharacter getMyCharacter(Character c) {
        MyCharacter myChar = pool.get(c);
        if (myChar == null) {
            myChar = new MyCharacter(c);
            pool.put(c, myChar);
        }
        
        return myChar;
    }
}
