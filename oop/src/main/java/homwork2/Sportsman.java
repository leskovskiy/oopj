package homwork2;

public  abstract class Sportsman {
    protected String info;
    protected int maxdistance;
    protected double maxheight;
    protected String succesfulrunresult;
    protected String badrunresult;
    protected String succesfuljumpresult;
    protected String badjumpresult;

    public Sportsman(String name, int maxdistance, double maxheight) {
        this.info = " ";
        this.maxdistance = maxdistance;
        this.maxheight = maxheight;
        this.succesfulrunresult = " ";
        this.badrunresult = " ";
        this.succesfuljumpresult = "";
        this.badjumpresult = " ";
    }


    public String getInfo() {
        return info;
    }
    public String getRunResult(Integer distance) {
        boolean b = distance < maxdistance;
        if b = true {
            return  info + succesfulrunresult + distance;
        }
        b = false;
        return info + badrunresult;
    }
    // Прыгать через стенку. Сравнивается высота стенки и возможность ее перепрыгнуть
    public String getJumpResult(Integer height){

        boolean b = maxheight < height;
        if b = true {
            return  info + succesfuljumpresult + height;
        }
        b = false;
        return info + badjumpresult;
    }

}
