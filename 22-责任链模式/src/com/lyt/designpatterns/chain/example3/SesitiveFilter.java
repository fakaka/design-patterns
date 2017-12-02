package com.lyt.designpatterns.chain.example3;

public class SesitiveFilter implements Filter {
    
    /**
     * process the sensitive words
     */
    @Override
    public String doFilter(String str) {
        return str.replace("被就业", "就业").replace("敏感", "");
    }
    
}
