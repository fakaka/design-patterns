package com.lyt.designpatterns.bridge.example2;

public class TvControl extends AbsTvControl {
    
    private int ch = 0;
    
    private boolean ison = false;
    
    public TvControl(Control mControl) {
        super(mControl);
    }
    
    @Override
    public void Onoff() {
        if (ison) {
            ison = false;
            mControl.Off();
        }
        else {
            ison = true;
            mControl.On();
        }
        
    }
    
    @Override
    public void nextChannel() {
        ch++;
        mControl.setChannel(ch);
    }
    
    @Override
    public void preChannel() {
        ch--;
        if (ch < 0) {
            ch = 200;
        }
        mControl.setChannel(ch);
    }
    
}
