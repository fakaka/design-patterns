package com.lyt.designpatterns.bridge.example2;

public abstract class AbsTvControl {
    
    Control mControl = null;
    
    public AbsTvControl(Control mControl) {
        this.mControl = mControl;
    }
    
    public abstract void Onoff();
    
    public abstract void nextChannel();
    
    public abstract void preChannel();
    
}
