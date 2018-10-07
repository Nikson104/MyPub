package by.pub;

import by.pub.Menu.MenuDisplay;
import by.pub.Menu.RootMenuItem;

public class PubManager {
    private RootMenuItem rootMenu = new MenuDisplay();

    public void execute() {
        rootMenu.execute();
    }
}