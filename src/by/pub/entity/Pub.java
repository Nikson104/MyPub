package by.pub.entity;

import java.util.ArrayList;
import java.util.List;

public class Pub {
    private String name;
    private String location;
    private List<String> eMail = new ArrayList<>();
    private List<Good> goods = new ArrayList<>();

    public Pub(String name, String location, List<String> eMail, List<Good> goods) {
        this.name = name;
        this.location = location;
        this.eMail = eMail;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> geteMail() {
        return eMail;
    }

    public void seteMail(List<String> eMail) {
        this.eMail = eMail;
    }
}
