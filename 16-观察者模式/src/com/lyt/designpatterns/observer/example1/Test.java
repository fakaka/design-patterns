package com.lyt.designpatterns.observer.example1;

public class Test {
    
    public static void main(String[] args) {
        
        WeatherDataSt mWeatherDataSt = new WeatherDataSt();
        
        CurrentConditions mCurrentConditions = new CurrentConditions();
        ForcastConditions mForcastConditions = new ForcastConditions();
        
        mWeatherDataSt.registerObserver(mCurrentConditions);
        mWeatherDataSt.registerObserver(mForcastConditions);
        
        mWeatherDataSt.setData(30, 150, 40);
        
        mWeatherDataSt.removeObserver(mCurrentConditions);
        mWeatherDataSt.setData(40, 250, 50);
        
    }
    
}
