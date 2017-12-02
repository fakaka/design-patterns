package com.lyt.designpatterns.chain.example3;

public class Test {
    
    public static void main(String[] args) {
        String msg = "佛说:)<script>被就业";
        
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter()).addFilter(new SesitiveFilter());
        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new FaceFilter());
        
        fc.addFilter(fc2);
        mp.setFc(fc);
        String result = mp.process();
        
        System.out.println(result);
    }
    
}
