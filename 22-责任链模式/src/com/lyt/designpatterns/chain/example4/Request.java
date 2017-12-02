package com.lyt.designpatterns.chain.example4;

public class Request {
    
    String requestStr;
    
    public Request() {}
    
    public Request(String requestStr) {
        this.requestStr = requestStr;
    }
    
    public String getRequestStr() {
        return requestStr;
    }
    
    public void setRequestStr(String requestStr) {
        this.requestStr = requestStr;
    }
}
