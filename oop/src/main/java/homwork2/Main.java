package homwork2;

public class Main {
    public static void main(String[] args) {
        Sportsman[] sportsmen = {
                new Cat("Barsik", 200, 3.0),
                new Human("Vasya", 10000, 2.0),
                new Robot("QWE", 1000000, 6.0)
        };

        for (Sportsman a : sportsmen) {
            a.run(300);
            a.jump(8);
        }
        System.out.println(Sportsman.countOfSportsman);
        System.out.println(Cat.countOfCat);
        System.out.println(Human.countOfHuman);
        System.out.println(Robot.countOfRobot);
    }
}