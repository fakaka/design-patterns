package com.lyt.designpatterns.lod.example2;

public class Test {
    
    public static void main(String[] args) {
        SomeOne zhangsan = new SomeOne();
        zhangsan.setFriend(new Friend());
        zhangsan.setStranger(new StrangerA());
        zhangsan.play();
    }
    
}
