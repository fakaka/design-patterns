package com.lyt.designpatterns.interpreter.example1;

public class PlusExpression extends Expression {
    
    @Override
    public void interpret(Context context) {
        System.out.println("递增");
        String input = context.getInput();
        int intInput = Integer.parseInt(input);
        intInput++;
        context.setInput(String.valueOf(intInput));
        context.setOutput(intInput);
    }
    
}
