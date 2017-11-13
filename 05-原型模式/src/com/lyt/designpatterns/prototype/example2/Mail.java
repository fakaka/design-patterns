package com.lyt.designpatterns.prototype.example2;

public class Mail implements Cloneable {
    
    private String receiver;
    
    private String subject;
    
    private String content;
    
    private String tail;
    
    public Mail(EventTemplate et) {
        this.tail = et.getEventContent();
        this.subject = et.getEventSubject();
        
    }
    
    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
    
    public String getReceiver() {
        return receiver;
    }
    
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public String getTail() {
        return tail;
    }
    
    public void setTail(String tail) {
        this.tail = tail;
    }
    
}
