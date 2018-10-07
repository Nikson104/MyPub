package by.pub.Action;

import by.pub.entity.Good;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchByRegion implements Action {
    static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public List<Good> execute(List<Good> goods) {
        String region = SCANNER.nextLine();
        List<Good> filteredList = new ArrayList<>();
        for (Good good : goods) {
            if (good.getCountry().equals(region)) ;
            filteredList.add(good);
        }
        return filteredList;
    }

    @Override
    public String name() {
        return null;
    }
}
