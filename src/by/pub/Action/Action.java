package by.pub.Action;

import by.pub.entity.Good;

import java.util.List;

public interface Action {
    List<Good> execute(List<Good> goods);

    String name();
}
