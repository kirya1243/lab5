package lab5.CommadManager.Commands.ZeroArgumentCommands;

import lab5.CollectionManager.CollectionManager;

public class Clear extends Command{
    @Override
    public String execute() {
        CollectionManager.clearCollection();
        return "Clear!";
    }
}
