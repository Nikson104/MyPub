package by.pub.entity;

import java.util.Date;

public class Beer extends Good {
    public Beer(int id, String name, String country, Date year, int price, boolean visible) {
        super(id, name, country, year, price, visible);
    }
}
