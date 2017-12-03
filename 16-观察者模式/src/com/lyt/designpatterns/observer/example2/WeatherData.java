package com.lyt.designpatterns.observer.example2;

import java.util.Observable;

public class WeatherData extends Observable {
    
    private float mTemperatrue;
    
    private float mPressure;
    
    private float mHumidity;
    
    public float getTemperature() {
        return mTemperatrue;
    }
    
    public float getPressure() {
        return mPressure;
    }
    
    public float getHumidity() {
        return mHumidity;
    }
    
    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }
    
    public void dataChange() {
        this.setChanged();
        this.notifyObservers(this);
    }
    
}
