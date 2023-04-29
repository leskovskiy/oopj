package homwork5;

public class Teacher extends User{

    String company;
    Integer stazh;
    String doljnost;

    public Teacher(String name, String secondName, Integer age) {
        super(name, secondName, age);
    }

    @Override
    public void info() {
        System.out.println();
    }
}
