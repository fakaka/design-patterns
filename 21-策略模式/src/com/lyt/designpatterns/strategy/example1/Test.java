package com.lyt.designpatterns.strategy.example1;

public class Test {
    
    public static void main(String[] args) {
        // Strategy stra = new MDSStrategy();
        // stra.encrypt();
        Context context = new Context(new SHA1Strategy());
        context.encrypt();
    }
}
