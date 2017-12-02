package com.lyt.designpatterns.bridge.example1;

public class Test {
    
    public static void main(String[] args) {
        LGTvControl mLGTvControl = new LGTvControl();
        SonyTvControl mSonyTvControl = new SonyTvControl();
        
        mLGTvControl.Onoff();
        mLGTvControl.nextChannel();
        mLGTvControl.nextChannel();
        mLGTvControl.preChannel();
        mLGTvControl.Onoff();
        
        mSonyTvControl.Onoff();
        mSonyTvControl.preChannel();
        mSonyTvControl.preChannel();
        mSonyTvControl.preChannel();
        mSonyTvControl.Onoff();
    }
    
}
