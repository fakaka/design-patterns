package com.lyt.designpatterns.lod.example1;

public class SomeOne {
    
    public void play(Friend friend) {
        System.out.println("someone play");
        friend.play();
    }
    
    public void play(Stranger stranger) {
        System.out.println("someone play");
        stranger.play();
    }
}
