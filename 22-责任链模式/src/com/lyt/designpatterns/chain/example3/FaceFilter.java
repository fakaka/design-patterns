package com.lyt.designpatterns.chain.example3;

public class FaceFilter implements Filter {
    
    @Override
    public String doFilter(String str) {
        return str.replace(":)", "^_^");
    }
    
}
