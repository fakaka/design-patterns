package com.lyt.designpatterns.bridge.example1;

public class LGTvControl extends LGControl implements TvControl {
    
    private static int ch = 0;
    
    private static boolean on = false;
    
    @Override
    public void Onoff() {
        if (on) {
            on = false;
            super.Off();
        }
        else {
            on = true;
            super.On();
        }
    }
    
    @Override
    public void nextChannel() {
        ch++;
        super.setChannel(ch);
    }
    
    @Override
    public void preChannel() {
        ch--;
        if (ch < 0) {
            ch = 200;
        }
        super.setChannel(ch);
    }
    
}
