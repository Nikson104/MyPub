package by.pub.Menu;

import by.pub.Action.Action;

import java.util.Scanner;
import java.util.logging.Logger;

public class MenuCommonOperation {
    private static final Logger LOGGER = Logger.getLogger(MenuCommonOperation.class.getName());

    private static final Scanner SCANNER = new Scanner(System.in);

    private Action operation;
    private RootMenuItem rootMenuItem;

    public MenuCommonOperation(Action operation, RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
        this.operation = operation;
    }
}
