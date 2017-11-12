package com.lyt.designpatterns.state.example5;

/**
 * 空闲状态
 * 
 * @author MJ
 *
 */
public class FreeState implements State {
    
    @Override
    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }
    
}
