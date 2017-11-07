package com.lyt.designpatterns.builder.example3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Vacation {
    
    private ArrayList<VacationDay> vacationDayList;
    
    private Date date;
    
    private int days = 0;
    
    private VacationDay vacationDay;
    
    public Vacation(String std) {
        vacationDayList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(std);
            vacationDay = new VacationDay(date);
            vacationDayList.add(vacationDay);
            days++;
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    public void setDate(String std) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(std);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    public Date getDate() {
        
        return date;
    }
    
    public void addDay() {
        
        vacationDay = new VacationDay(nextDate(days));
        vacationDayList.add(vacationDay);
        days++;
    }
    
    public boolean setVacationDay(int i) {
        if ((i > 0) && (i < vacationDayList.size())) {
            vacationDay = vacationDayList.get(i);
            return true;
        }
        vacationDay = null;
        return false;
    }
    
    public void setHotel(String mHotels) {
        vacationDay.setHotel(mHotels);
    }
    
    public void addTicket(String ticket) {
        vacationDay.addTicket(ticket);
    }
    
    public void addEvent(String event) {
        vacationDay.addEvent(event);
    }
    
    public void showInfo() {
        for (int i = 0, len = vacationDayList.size(); i < len; i++) {
            System.out.println("--- " + (i + 1) + " day---");
            System.out.println(vacationDayList.get(i).showInfo());
        }
    }
    
    private Date nextDate(int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, n);
        return cal.getTime();
    }
}
