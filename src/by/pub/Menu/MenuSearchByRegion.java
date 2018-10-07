package by.pub.Menu;

import by.pub.Action.SearchByPrice;
import by.pub.Action.SearchByRegion;

public class MenuSearchByRegion extends MenuCommonOperation implements MenuItem {
    public MenuSearchByRegion(RootMenuItem rootMenu) {
        super(new SearchByRegion(), rootMenu);
    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "SearchByRegion";
    }
}
