package by.pub.Menu;

import by.pub.Action.SortByPrice;

public class MenuSortByPrice extends MenuCommonOperation implements MenuItem {
    public MenuSortByPrice(RootMenuItem rootMenu) {
        super(new SortByPrice(), rootMenu);
    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "SortByPrice";
    }
}
