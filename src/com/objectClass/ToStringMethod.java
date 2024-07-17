package com.objectClass;

public class ToStringMethod {

    public static void main(String[] args) {
        Students students = new Students(101, "Sivi Singh");
        System.out.println(students.toString());
        System.out.println(students);
    }
}
class Students{
    private Integer studentId;
    private String studentName;

    public Students(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}