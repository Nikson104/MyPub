package by.pub.Menu;

import by.pub.Action.InfoSimilarBeer;

public class MenuInfoSimilarBeer extends MenuCommonOperation implements MenuItem {
    public MenuInfoSimilarBeer(RootMenuItem rootMenu) {
        super(new InfoSimilarBeer(), rootMenu);
    }

    @Override
    public void execute() {
    }

    @Override
    public String name() {
        return "InfoSimilarBeer";
    }
}
