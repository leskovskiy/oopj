package homwork2;

public class Cat extends Sportsman {

    static int countOfCat;
    public Cat(String name, int maxdistance, double maxheight) {
        super(name, maxdistance, maxheight);
        countOfCat++;
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
        if(height>maxdistance){
            System.out.println(name + "не допрыгнул");
        }
        else{
            System.out.println(name + "допрыгнул");
        }
    }
}
