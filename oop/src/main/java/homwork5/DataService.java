package homwork5;

import java.util.List;

public interface DataService {
    void create(Students students,List<Students> list);
    void read(List<Students> list);

    void deduction(Students students,List<Students> list);
    void rate(Students students);
}
