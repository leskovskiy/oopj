package homwork1;

import jdk.jfr.Category;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tovar {
    private String name;
    private Integer cost;
    private Integer rating;

    public Tovar(String name, Integer cost, Integer rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public Tovar() {

    }


    public String getName() {
        return name;
    }

    public void  setName(String name) {this.name = name;}

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                '}';
    }

    public String getinfo() {
        return getName();
    }
}
