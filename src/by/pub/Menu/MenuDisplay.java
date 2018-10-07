package by.pub.Menu;

import java.util.Scanner;

public class MenuDisplay implements RootMenuItem {
    private static final Scanner SCANNER = new Scanner(System.in);

    private MenuItem[] subMenus = {
            new MenuSortByName(this),
            new MenuSortByPrice(this),
            new MenuSearchByName(this),
            new MenuSearchByPrice(this),
            new MenuSearchByDateProduction(this),
            new MenuSearchByRegion(this),
            new MenuInfoSimilarBeer(this),
    };

    @Override
    public void execute() {
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println(i + " " + subMenus[i].name());
        }
        subMenus[SCANNER.nextInt()].execute();
    }
}
