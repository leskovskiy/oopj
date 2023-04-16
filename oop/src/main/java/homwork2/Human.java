package homwork2;

public class Human extends Sportsman{
    public static final String Human = "Кот";
    public static final String Run_res_god = "добежал ";
    public static final String Run_res_bad = "не добежал";
    public static final String Jump_res_god = "перепрыгнул ";
    public static final String Jump_res_bad = "не допрыгнул ";


    public Human(String name, int maxdistance, double maxheight) {
        super(name, maxdistance, maxheight);
        super.info = Human + name;
        super.succesfulrunresult = Run_res_god;
        super.badrunresult = Run_res_bad;
        super.succesfuljumpresult = Jump_res_god;
        super.badjumpresult = Jump_res_bad;
    }
}
