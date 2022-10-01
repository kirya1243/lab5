package lab5.CommadManager.Commands.OneArgumentCommands;

import lab5.CollectionManager.CollectionManager;
import lab5.Organization.Organization;

public class RemoveGreater extends CommandOne<Organization> {
    @Override
    public String execute(Organization arg) {
        CollectionManager.removeGreater(arg.getAnnualTurnover());
        return "Done";
    }
}
