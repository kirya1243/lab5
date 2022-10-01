package lab5.CommadManager.Commands.OneArgumentCommands;

import lab5.CollectionManager.CollectionManager;
import lab5.Organization.Organization;

public class AddIfMin extends CommandOne<Organization> {
    @Override
    public String execute(Organization arg) {
        if (arg.getAnnualTurnover() < CollectionManager.getMinAnnualTurnover()){
            CollectionManager.addElement(arg);
            return "Added";
        }
        return "Annual Turnover more than the minimum";
    }
}
