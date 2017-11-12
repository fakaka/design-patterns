package com.lyt.designpatterns.command.example2;

public class LightOnCommand implements Command {
    
    private Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.On();
    }
    
    @Override
    public void undo() {
        light.Off();
    }
    
}
