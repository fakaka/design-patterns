package com.lyt.designpatterns.observer.example2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer {
    
    private float mTemperatrue;
    
    private float mPressure;
    
    private float mHumidity;
    
    @Override
    public void update(Observable o, Object arg) {
        this.mTemperatrue = ((WeatherData) o).getTemperature();
        this.mPressure = ((WeatherData) o).getPressure();
        this.mHumidity = ((WeatherData) o).getHumidity();
        display();
    }
    
    public void display() {
        System.out.println("***Today mTemperatrue:" + mTemperatrue + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidity + "***");
    }
    
}
