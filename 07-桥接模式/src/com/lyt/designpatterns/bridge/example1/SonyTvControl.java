package com.lyt.designpatterns.bridge.example1;

public class SonyTvControl extends SonyControl implements TvControl {
    
    private static int ch = 0;
    
    private static boolean on = false;
    
    @Override
    public void Onoff() {
        
        if (on) {
            super.Off();
        }
        else {
            super.On();
        }
        on = !on;
    }
    
    @Override
    public void nextChannel() {
        ch++;
        super.setChannel(ch);
    }
    
    @Override
    public void preChannel() {
        if (--ch < 0) {
            ch = 200;
        }
        super.setChannel(ch);
    }
    
}
