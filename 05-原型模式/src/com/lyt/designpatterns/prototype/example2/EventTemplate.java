package com.lyt.designpatterns.prototype.example2;

public class EventTemplate {
    
    private String eventSubject, eventContent;
    
    public EventTemplate(String eventSubject, String eventContent) {
        this.eventSubject = eventSubject;
        this.eventContent = eventContent;
    }
    
    public String getEventSubject() {
        return eventSubject;
    }
    
    public String getEventContent() {
        return eventContent;
    }
    
}
