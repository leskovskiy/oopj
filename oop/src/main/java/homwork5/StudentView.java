package homwork5;

public class StudentView {

    public void view(Students student) {
        UserData udt = new UserData();
        for (Students s: udt.getStudentsList()) {
            if (s.equals(student)){
                System.out.println(s.toString());
            }

        }

    }
}
