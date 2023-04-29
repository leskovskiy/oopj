package homwork5;

public class Controler {
    public static void main(String[] args) {
        Students students = new Students("Иван","Иванов",19,"МБМ-23",5);
        Students students1 = new Students("Pety","Petrov",25,"MB-41",2);
        Students students2 = new Students("MASHA","Ivanova",20,"BN-61",4);
        UserService userService = new UserService();
        UserData data = new UserData();
        userService.create(students,data.getStudentsList());
        userService.create(students1,data.getStudentsList());
        userService.create(students2,data.getStudentsList());
        StudentView studentView = new StudentView();
        studentView.view(students);
        studentView.view(students1);
        studentView.view(students2);
        TeacherView teacherView = new TeacherView();
        userService.deduction(data.getStudentsList(),students);
        userService.deduction(data.getStudentsList(),students1);
        teacherView.view();
        teacherView.view();


    }

}
