package Practice_core_java.src.com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StudentMap {

    public HashMap<String ,Student>addStudentIdAndNameInHashMap(){
        Student student = new Student();
        student.setStudentId("101");
        student.setStudentName("Sivangi");
        List<String> subjects = Arrays.asList("Maths", "Hindi", "English", "Art", "Science");
        student.setStudentSubjects(subjects);
        System.out.println(student);
        HashMap<String, Student> idStudentHashMap = new HashMap<>();

        return null ;
    }
    public static void main(String[] args) {

    new StudentMap().addStudentIdAndNameInHashMap();
    }
}
class Student{
    String studentId;
    String studentName;
    List<String> studentSubjects;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(List<String> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    public Student(String studentId, String studentName, ArrayList<String> studentSubjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSubjects = studentSubjects;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSubjects=" + studentSubjects +
                '}';
    }
}
