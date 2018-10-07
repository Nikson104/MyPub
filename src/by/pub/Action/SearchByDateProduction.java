package by.pub.Action;

import by.pub.entity.Good;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchByDateProduction implements Action {
    private Date year;

    public SearchByDateProduction(Date year) {
        this.year = year;
    }

    @Override
    public List<Good> execute(List<Good> goods) {
        List<Good> filteredList = new ArrayList<>();
        for (Good good : goods) {
            if (good.getYear().equals(year)) ;
            filteredList.add(good);
        }
        return filteredList;
    }

    @Override
    public String name() {
        return null;
    }
}
