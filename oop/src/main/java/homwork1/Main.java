package homwork1;

import jdk.jfr.Category;

import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("milk",100,1);
        Tovar tovar1 = new Tovar("bread",50,2);
        Tovar tovar2 = new Tovar("meat",450,4);

        Сategorya categorya = new Сategorya();
        System.out.println("В наличии: " + tovar.getinfo()+ " " + tovar1.getinfo() +
                " " + tovar2.getinfo());



    }
}
