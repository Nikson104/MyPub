package by.pub.Menu;

import by.pub.Action.SortByName;

public class MenuSortByName extends MenuCommonOperation implements MenuItem {
    public MenuSortByName(RootMenuItem rootMenu) {
        super(new SortByName(), rootMenu);
    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "SortByName";
    }
}
