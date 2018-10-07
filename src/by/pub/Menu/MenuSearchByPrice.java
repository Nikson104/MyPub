package by.pub.Menu;

import by.pub.Action.SearchByPrice;

public class MenuSearchByPrice extends MenuCommonOperation implements MenuItem {
    public MenuSearchByPrice(RootMenuItem rootMenu) {
        super(new SearchByPrice(), rootMenu);

    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "SearchByPrice";
    }
}
