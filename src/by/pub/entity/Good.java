package by.pub.entity;

import java.util.Date;

public abstract class Good {
    private int id;
    private String name;
    private String country;
    private Date year;
    private int price;
    private boolean visible;


    public Good(int id, String name, String country, Date year, int price, boolean visible) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.year = year;
        this.price = price;
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
