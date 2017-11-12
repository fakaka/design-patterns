package com.lyt.designpatterns.state.example5;

/**
 * 已入住状态
 * 
 * @author MJ
 *
 */
public class CheckedInState implements State {
    
    @Override
    public void handle() {
        System.out.println("房间已入住！请勿打扰！");
    }
    
}
