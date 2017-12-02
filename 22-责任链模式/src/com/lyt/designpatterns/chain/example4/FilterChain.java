package com.lyt.designpatterns.chain.example4;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    
    List<Filter> filters = new ArrayList<>();
    
    int index = 0;
    
    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }
    
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) {
            return;
        }
        
        filters.get(index++).doFilter(request, response, chain);
    }
}
