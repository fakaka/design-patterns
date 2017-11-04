package com.lyt.designpatterns.memento.example1;

import java.util.HashMap;

public class MementoCaretaker {
    
    private HashMap<String, MementoIF> mementomap;
    
    public MementoCaretaker() {
        mementomap = new HashMap<>();
    }
    
    public MementoIF retrieveMemento(String name) {
        return mementomap.get(name);
    }
    
    public void saveMemento(String name, MementoIF memento) {
        mementomap.put(name, memento);
    }
}
