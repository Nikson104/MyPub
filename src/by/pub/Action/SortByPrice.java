package by.pub.Action;

import by.pub.entity.Good;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPrice implements Action {
    @Override
    public List<Good> execute(List<Good> goods) {
        Collections.sort(goods, new Comparator<Good>() {
            @Override
            public int compare(Good o1, Good o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
        return goods;
    }

    @Override
    public String name() {
        return null;
    }
}
