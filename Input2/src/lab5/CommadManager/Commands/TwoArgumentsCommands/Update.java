package lab5.CommadManager.Commands.TwoArgumentsCommands;

import lab5.CollectionManager.CollectionManager;
import lab5.Organization.Organization;

public class Update extends CommandTwo <Integer, Organization>{
    @Override
    public String execute(Integer id, Organization arg) {
        if (CollectionManager.DelById(id)) {
            arg.setId(id);
            CollectionManager.addElement(arg);
            return "Updated";
        } else return "No such id";
    }
}
