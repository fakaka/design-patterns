package com.lyt.designpatterns.chain.example4;

public interface Filter {
    
    void doFilter(Request request, Response response, FilterChain chain);
}
