package com.lyt.designpatterns.command.example3;

public class BananaCommand extends Command {
    
    public BananaCommand(Peddler peddler) {
        super(peddler);
    }
    
    @Override
    public void sell() {
        this.getPeddler().sellBanana();
    }
    
}
