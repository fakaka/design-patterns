package com.lyt.designpatterns.command.example3;

public class AppleCommand extends Command {
    
    public AppleCommand(Peddler peddler) {
        super(peddler);
    }
    
    @Override
    public void sell() {
        this.getPeddler().sellApple();
    }
    
}
