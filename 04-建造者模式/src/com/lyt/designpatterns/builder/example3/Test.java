package com.lyt.designpatterns.builder.example3;

public class Test {
    
    public static void main(String[] args) {
        
        BuilderSelf builder = new BuilderSelf("2015-9-29");
        
        builder.addTicket("Plane Ticket").addEvent("Fly to Destination").addEvent("Supper").addHotel("Hilton");
        
        builder.addDay().addTicket("Zoo Ticket").addEvent("Bus to Zoo").addEvent("Feed animals").addHotel("Home Inn");
        
        builder.addDay();
        builder.addTicket("Beach");
        builder.addEvent("Swimming");
        builder.addHotel("Home inn");
        
        builder.addDay().addTicket("Plane Ticket").addEvent("Fly to Home");
        builder.getVacation().showInfo();
    }
    
}
