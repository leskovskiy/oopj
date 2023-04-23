package homwork4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator1 calculator1 = new Calculator1();
        List<Double> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for (int i = 1; i < 6 ; i++) {
            ls.add((double)i);
            ls2.add(i);
        }



        System.out.println(calculator1.mul(ls));
        System.out.println(calculator1.div(ls2));
        System.out.println(calculator1.bin(145));

    }
}
