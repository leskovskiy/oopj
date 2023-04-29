package homwork5;

public class Teacher extends User{

    String company;
    Integer stazh;


    public Teacher(String name, String secondName, Integer age,String company,Integer stazh) {
        super(name, secondName, age);
        this.company = company;
        this.stazh = stazh;

    }

    @Override
    public void info() {
        System.out.println("Предодаватель " + super.name + super.secondName + "Возраст: " + super.age + "Группа:" + this.stazh + this.company);
    }
}
