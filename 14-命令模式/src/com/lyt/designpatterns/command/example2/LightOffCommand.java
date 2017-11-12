package com.lyt.designpatterns.command.example2;

public class LightOffCommand implements Command {
    
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.Off();
    }
    
    @Override
    public void undo() {
        light.On();
    }
    
}
