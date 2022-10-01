package lab5.CommadManager.Commands.OneArgumentCommands;

import lab5.CollectionManager.CollectionManager;

public class RemoveById extends CommandOne<Integer> {
    @Override
    public String execute(Integer id) {
        if (CollectionManager.DelById(id)) {
            return "Removed";
        } else return "No such id";
    }
}
