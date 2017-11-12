package com.lyt.designpatterns.command.example3;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    
    private List<Command> commands = new ArrayList<>();
    
    public void setOrder(Command command) {
        commands.add(command);
    }
    
    public void removeOrder(Command command) {
        commands.remove(command);
    }
    
    public void sell() {
        for (Command command : commands) {
            command.sell();
        }
    }
}
