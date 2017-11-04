package com.lyt.designpatterns.memento.example1;

public class Test {
    
    public static void main(String[] args) {
        
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Originator mOriginator = new Originator();
        Originator2 mOriginator2 = new Originator2();
        
        System.out.println("*****Originator*****");
        mOriginator.testState1();
        mementoCaretaker.saveMemento("Originator", mOriginator.createMemento());
        mOriginator.showState();
        mOriginator.testState2();
        mOriginator.showState();
        mOriginator.restoreMemento(mementoCaretaker.retrieveMemento("Originator"));
        mOriginator.showState();
        
        System.out.println("*****Originator 2*****");
        mOriginator2.testState1();
        mOriginator2.showState();
        mementoCaretaker.saveMemento("Originator2", mOriginator2.createMemento());
        mOriginator2.testState2();
        mOriginator2.showState();
        mOriginator2.restoreMemento(mementoCaretaker.retrieveMemento("Originator2"));
        mOriginator2.showState();
        
        // System.out.println("*****Originator&&Originator 2*****");
        // mOriginator.restoreMemento(mMementoCaretaker
        // .retrieveMemento("Originator2"));
        // mOriginator.showState();
        
    }
    
}
