package Practice_core_java.objectClass;

public class GetClassMethod {

    public static void main(String[] args) {
        String string="Welcome Rameshwar Singh";

        Class<?> aClass = string.getClass();

        System.out.println("Class instance information:  "+aClass);

        Student student = new Student(101, "Rameshwar Singh");

        Class<?> infoStudent=    student.getClass();

        System.out.println("Student class info: "+infoStudent);

    }
}
class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}