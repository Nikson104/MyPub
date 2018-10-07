package by.pub.Menu;

import by.pub.Action.SearchByDateProduction;

public class MenuSearchByDateProduction extends MenuCommonOperation implements MenuItem {
    public MenuSearchByDateProduction(RootMenuItem rootMenu) {
        super(new SearchByDateProduction(), rootMenu);
    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "SearchByDateProduction";
    }
}
