package homwork2;

public  abstract class Sportsman {

    protected String name;
    protected String info;
    protected int maxdistance;
    protected double maxheight;
    protected String succesfulrunresult;
    protected String badrunresult;
    protected String succesfuljumpresult;
    protected String badjumpresult;

    static int countOfSportsman;


    public Sportsman(String name, int maxdistance, double maxheight) {
        this.name = " ";
        this.info = " ";
        this.maxdistance = maxdistance;
        this.maxheight = maxheight;
        this.succesfulrunresult = " ";
        this.badrunresult = " ";
        this.succesfuljumpresult = "";
        this.badjumpresult = " ";
        countOfSportsman++;
    }

    void run(Integer distance){
        if(distance>maxdistance){
            System.out.println(name + "не добежал");
        }
        else{
            System.out.println(name + "добежал");
        }
    }

    void jump (Integer height){
        if(height>maxdistance){
            System.out.println(name + "не допрыгнул");
        }
        else{
            System.out.println(name + "допрыгнул");
        }
    }
    public String getInfo() {
        return info;
    }

}
