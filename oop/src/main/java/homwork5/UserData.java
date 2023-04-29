package homwork5;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private static List<Students> studentsList = new ArrayList<>();

    public List<Students> getStudentsList() {

        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }
}
