package Practice_core_java.src.com.objectClass.toString;

public class ToStringDemo {

    public static void main(String[] args) {

        //creating object for Student
        Students student = new Students("Sivi Singh", " Math's");
        //printing Student without toString overriding
        System.out.println(student);//its gives Hash code
        //output: fully Qualified class name com.objectClass.toString.Students@1b28cdfa

        //printing to overriding method its give content of the object
        System.out.println(student);


    }

}
class Students{
    String studentName;
    String StudentSubject;

    public Students(String studentName, String studentSubject) {
        this.studentName = studentName;
        StudentSubject = studentSubject;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", StudentSubject='" + StudentSubject + '\'' +
                '}';
    }
}
