package com.java8.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOperation {

    public static void operation(List<Student> studentList){
           //studentList.stream().map(e->e.getSubject()).peek(System.out::println).toList();

        Map<String, List<String>> nameSubjectMap = studentList.stream().collect(Collectors.toMap(e -> e.getStudentName(),
                s -> s.getSubject()));
        System.out.println(nameSubjectMap);

    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student(101, "Rajan", "male", Arrays.asList("Hindhi", "English", "Maths", "Science", "Art"), LocalDate.of(2020, 02, 12)),
                new Student(102, "Amisha", "female", Arrays.asList("Hindhi", "English", "Maths", "Science", "Sanskrit"), LocalDate.of(2019, 03, 10)),
                new Student(103, "Siva", "male", Arrays.asList("Hindhi", "English", "Maths", "Science", "Sanskrit"), LocalDate.of(2019, 03, 15)),
                new Student(104, "Bandana", "female", Arrays.asList("Hindhi", "English", "Maths", "Science", "Art"), LocalDate.of(2020, 03, 13)),
                new Student(105, "Zaheer", "male", Arrays.asList("Hindhi", "English", "Maths", "Science", "Art"), LocalDate.of(2019, 05, 8)));

        //studentList.forEach(System.out::println);
        operation(studentList);
    }
}

class Student {
    private Integer studentId;
    private String studentName;
    private String gender;
    private List<String> subject;
    private LocalDate joiningDate;

    public Student(Integer studentId, String studentName, String gender, List<String> subject, LocalDate joiningDate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.subject = subject;
        this.joiningDate = joiningDate;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName='" + studentName + '\'' + ", gender='" + gender + '\'' + ", subject=" + subject + ", joiningDate=" + joiningDate + '}';
    }
}
