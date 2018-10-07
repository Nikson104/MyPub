package by.pub.Action;

import by.pub.entity.Good;

import java.util.ArrayList;
import java.util.List;

public class SearchByPrice implements Action {
    private int price;

    public SearchByPrice(int price) {
        this.price = price;
    }

    @Override
    public List<Good> execute(List<Good> goods) {
        List<Good> filteredList = new ArrayList<>();
        for (Good good : goods) {
            if (good.getPrice() == price) ;
            filteredList.add(good);
        }
        return filteredList;
    }

    @Override
    public String name() {
        return null;
    }
}
