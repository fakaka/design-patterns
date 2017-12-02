package com.lyt.designpatterns.bridge.example1;

public interface Control {
    
    public void On();
    
    public void Off();
    
    public void setChannel(int ch);
    
    public void setVolume(int vol);
    
}
