package com.lyt.designpatterns.bridge.example2;

public class NewTvControl extends AbsTvControl {
    
    private int channel = 0;
    
    private boolean ison = false;
    
    private int preChannel = 0;
    
    public NewTvControl(Control mControl) {
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
        preChannel = channel;
        channel++;
        mControl.setChannel(channel);
        
    }
    
    @Override
    public void preChannel() {
        preChannel = channel;
        channel--;
        if (channel < 0) {
            channel = 200;
        }
        mControl.setChannel(channel);
        
    }
    
    public void setChannel(int nch) {
        preChannel = channel;
        channel = nch;
        mControl.setChannel(channel);
        
    }
    
    public void Back() {
        mControl.setChannel(preChannel);
    }
}
