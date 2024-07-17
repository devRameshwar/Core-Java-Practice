package com.methodReferencing;

public class Employee {

    private Integer id;
    private String employeeName;
    private Integer age;
    private Double salary;

    public Employee(Integer id, String employeeName, Integer age, Double salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public static Boolean checkAgeAndSalary(Employee employee) {
        return employee.age > 30 || employee.getSalary() > 4000;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
