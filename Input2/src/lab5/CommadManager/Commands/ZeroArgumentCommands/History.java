package lab5.CommadManager.Commands.ZeroArgumentCommands;


import lab5.CommadManager.CommandManager;

import java.util.ArrayList;

public class History extends Command{
    private final ArrayList<String> history;
    public History(ArrayList<String> history) {
        this.history = history;
    }

    @Override
    public String execute() {
        return history.toString();
    }
}
