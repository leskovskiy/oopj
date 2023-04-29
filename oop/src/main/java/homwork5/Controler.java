package homwork5;

public class Controler {
    public static void main(String[] args) {
        Students students = new Students("Иван","Иванов",19,"МБМ-23");
        UserService userService = new UserService();
        UserData data = new UserData();
        userService.create(students,data.getStudentsList());
        userService.read(data.getStudentsList());
        StudentView studentView = new StudentView();
        studentView.view(students);
        TeacherView teacherView = new TeacherView();
        teacherView.view();
        teacherView.view(students);

    }

}
