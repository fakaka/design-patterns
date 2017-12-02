package com.lyt.designpatterns.chain.example4;

public class Test {
    
    public static void main(String[] args) {
        String msg = "佛说:)<script>被就业";
        Request request = new Request(msg);
        Response response = new Response();
        response.setResponseStr("response");
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter()).addFilter(new SesitiveFilter());
        
        fc.doFilter(request, response, fc);
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
    
}
