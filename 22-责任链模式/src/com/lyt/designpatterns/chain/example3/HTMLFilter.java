package com.lyt.designpatterns.chain.example3;

public class HTMLFilter implements Filter {
    
    @Override
    public String doFilter(String str) {
        return str.replace('<', '[').replace('>', ']');
    }
    
}
