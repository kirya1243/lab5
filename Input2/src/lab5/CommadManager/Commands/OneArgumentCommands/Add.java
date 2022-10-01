package lab5.CommadManager.Commands.OneArgumentCommands;

import lab5.CollectionManager.CollectionManager;
import lab5.Organization.Organization;

public class Add extends CommandOne<Organization> {

    @Override
    public String execute(Organization arg) {
        CollectionManager.addElement(arg);
        return "Added";
    }
}