package homwork5;

public class TeacherView {
    public void view(Students student) {
        UserData udt = new UserData();
        for (Students s : udt.getStudentsList()) {
            if (s.equals(student)) {
                System.out.println(s.toString());
            }

        }
    }
    public void view(){
        UserData udt = new UserData();
        System.out.println(udt.getStudentsList().toString());
    }


}
