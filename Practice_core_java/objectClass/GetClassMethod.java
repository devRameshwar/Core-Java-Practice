package Practice_core_java.objectClass;

import java.lang.reflect.Method;
import java.util.Arrays;

public class GetClassMethod {

    //uses of getClass methods

    //getting class information
    public static void gettingClassInformation() {
        String string = "Welcome Rameshwar Singh";

        Class<?> aClass = string.getClass();

        System.out.println("Class instance information:  " + aClass);//Class instance information:  class java.lang.String

        Object object = new Object();
        Class<?> objInfo = object.getClass();

        Student student = new Student(101, "Rameshwar Singh");
        Class<?> infoStudent = student.getClass();
        System.out.println("Student class info: " + infoStudent);//Student class info: class Practice_core_java.objectClass.Student


        //calling reflectionMethods
        reflectionMethods(aClass);

        reflectionMethods(objInfo);
    }

    //using reflection API
    public static void reflectionMethods(Class<?> aClass) {
        Method[] methods = aClass.getMethods();
        Method[] objectClassMethod = aClass.getMethods();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Method method : objectClassMethod) {
            System.out.println(method);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        gettingClassInformation();
    }
}

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}