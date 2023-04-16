package homwork2;

public class Robot extends Sportsman{

    static int countOfRobot;

    public Robot(String name, int maxdistance, double maxheight) {
        super(name, maxdistance, maxheight);
        countOfRobot++;
    }

    @Override
    void run(Integer distance) {
        if(distance>maxdistance){
            System.out.println(name + "не добежал");
        }
        else{
            System.out.println(name + "добежал");
        }
    }

    @Override
    void jump(Integer height) {
        if(height>maxheight){
            System.out.println(name + "не допрыгнул");
        }
        else{
            System.out.println(name + "допрыгнул");
        }
    }
}

