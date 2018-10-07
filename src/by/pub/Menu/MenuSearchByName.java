package by.pub.Menu;

import by.pub.Action.SearchByName;

public class MenuSearchByName extends MenuCommonOperation implements MenuItem {
    public MenuSearchByName(RootMenuItem rootMenu) {
        super(new SearchByName(), rootMenu);
    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "SearchByName";
    }
}
