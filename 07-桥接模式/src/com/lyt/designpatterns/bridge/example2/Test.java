package com.lyt.designpatterns.bridge.example2;

public class Test {
    
    public static void main(String[] args) {
        TvControl mLGTvControl;
        TvControl mSonyTvControl;
        mSonyTvControl = new TvControl(new SonyControl());
        mLGTvControl = new TvControl(new LGControl());
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
        
        NewTvControl mSharpTvControl;
        mSharpTvControl = new NewTvControl(new SharpControl());
        mSharpTvControl.Onoff();
        mSharpTvControl.nextChannel();
        mSharpTvControl.setChannel(9);
        mSharpTvControl.setChannel(28);
        mSharpTvControl.Back();
        mSharpTvControl.Onoff();
        
    }
    
}
