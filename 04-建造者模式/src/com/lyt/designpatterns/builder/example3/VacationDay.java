package com.lyt.designpatterns.builder.example3;

import java.util.ArrayList;
import java.util.Date;

public class VacationDay {
    
    private Date date;
    
    private String hotel;
    
    private ArrayList<String> tickets = null;
    
    private ArrayList<String> events = null;
    
    public VacationDay(Date date) {
        this.date = date;
        tickets = new ArrayList<>();
        events = new ArrayList<>();
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    
    public void addTicket(String ticket) {
        tickets.add(ticket);
    }
    
    public void addEvent(String event) {
        events.add(event);
    }
    
    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Date:" + date + "\n");
        sb.append("Hotel:" + hotel + "\n");
        sb.append("Tickets:" + tickets + "\n");
        sb.append("Events" + events + "\n");
        
        return sb.toString();
    }
}
