package homwork2;

public class Human extends Sportsman {
    static int countOfHuman;

    public Human(String name, int maxdistance, double maxheight) {
        super(name, maxdistance, maxheight);
        countOfHuman++;
    }


    @Override
    void run(Integer distance) {
        if (distance > maxdistance) {
            System.out.println(name + "не добежал");
        } else {
            System.out.println(name + "добежал");
        }
    }

    @Override
    void jump(Integer height) {
        if (height > maxdistance) {
            System.out.println(name + "не допрыгнул");
        } else {
            System.out.println(name + "допрыгнул");
        }
    }
}
