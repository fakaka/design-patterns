package com.lyt.designpatterns.state.example2;

public interface State {
    
    /** 投币 */
    public void insertCoin();
    
    /** 退币 */
    public void returnCoin();
    
    /** 转 */
    public void turnCrank();
    
    /** 分发 */
    public void dispense();
    
    /** 打印状态 */
    public void printState();
}
