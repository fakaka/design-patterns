package com.lyt.designpatterns.chain.example3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    
    List<Filter> filters = new ArrayList<>();
    
    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }
    
    @Override
    public String doFilter(String str) {
        String ret = str;
        for (Filter f : filters) {
            ret = f.doFilter(ret);
        }
        return ret;
    }
}
