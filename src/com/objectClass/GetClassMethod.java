package com.objectClass;

import java.lang.reflect.Method;

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
        System.out.println("Student class info: " + infoStudent);//Student class info: class Practice_core_java.src.com.objectClass.Student


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

    //Type compression
    public static void typeCompression(){
            Object object1="Hello Ramu";
            Object object2=1911;

           /* if (object1.getClass()==String.class){
                System.out.println("This is String class object");
            }else {
                System.out.println("This is Not a String class object");
            } */
        System.out.println(object1.getClass() == String.class ? "This is String class object" : "This is Not a String class object");

        System.out.println(object2.getClass()==Number.class?"This is number class Object":"This is not a number class object");




    }

    public static void main(String[] args) {
        //gettingClassInformation();
        typeCompression();

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