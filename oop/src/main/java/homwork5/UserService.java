package homwork5;

import java.util.List;

public class UserService implements DataService{

    @Override
    public void create(Students students,List<Students> list) {
        list.add(students);
    }

    @Override
    public void read(List<Students> list) {
        System.out.println(list.toString());
    }

    @Override
    public void deduction(Students students, List<Students> list) {

    }

    @Override
    public void deduction(List<Students> list,Students students) {
        list.remove(students);

    }

    @Override
    public void rate(Students students) {
        System.out.println(students.toString());

    }
}
