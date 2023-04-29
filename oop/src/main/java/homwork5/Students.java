package homwork5;

public class Students extends User{
    String group;
    Integer grade;


    public Students(String name, String secondName, Integer age, String group,Integer grade) {
        super(name, secondName, age);
        this.group = group;
        this.grade = grade;
    }

    public Students(String name, String secondName, Integer age) {
        super(name, secondName, age);
    }

    @Override
    public void info() {

        System.out.println("Студент " + super.name + super.secondName + "Возраст: " + super.age + "Группа:" + this.group + this.grade);


    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
