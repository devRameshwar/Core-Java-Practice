package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class EmployeeStream {

    //collect Employee name using Stream
    public static void collectEmployeeName() {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "Raju", 5000), new Employee(103, "Manoj", 60000)
                , new Employee(102, "Hari", 5000));

        //creating a stream object with help of list
        List<String> list = employeeList.stream().map(e -> e.getEmployeeName()).toList();
        System.out.print(list);

    }

    //allMatch(Predicate<? super T> predicate)
    //Returns whether all elements of this stream match the provided predicate.
    public static void allMatch() {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "Raju", 5000), new Employee(103, "Manoj", 60000)
                , new Employee(102, "Raju", 5000));

        boolean match = employeeList.stream().allMatch(e -> e.getEmployeeName().equals("Raju"));
        System.out.println(match);

    }

    //anyMatch(Predicate<? super T> predicate)
    //Returns whether any elements of this stream match the provided predicate.
    public static void anyMatch() {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "Raju", 5000), new Employee(103, "Manoj", 60000)
                , new Employee(102, "Raju", 5000));

        boolean match = employeeList.stream().anyMatch(e -> e.getEmployeeName().equals("Raju"));
        System.out.println(match);

    }

    //creating an object of stream
    public static void createObject() {
        String string[] = {"Good morning", "hello"};
        boolean match = stream(string).anyMatch(e -> e.equals("hello"));
        System.out.println(match);

        int[] number = {1, 2, 3, 4, 5};
        int average = (int) stream(number).average().getAsDouble();
        //double v = average.getAsDouble();
        System.out.println(average);
    }

    //filter method in stream
    public static void filterStreamOperation() {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "Rameshwar singh", 50000, 35, "male", "operation"),
                new Employee(101, "Sivi singh", 40000, 25, "female", "operation"),
                new Employee(101, "Ram", 35000, 25, "male", "development"),
                new Employee(101, "Anuj", 50000, 30, "male", "operation"),
                new Employee(101, "Ramesh singh", 45000, 35, "male", "development"));

        List<String> list = employeeList.stream().filter(e -> e.getAge() <= 30).map(e -> e.getEmployeeName()).toList();
        System.out.println(list);



    }

    //distinct() method and forEach method
    public static void getCityName(){
        List<Employee> employeeList = Arrays.asList(new Employee(101, "Rameshwar singh", 50000, 35, "male", "operation"),
                new Employee(101, "Sivi singh", 40000, 25, "female", "operation"),
                new Employee(102, "Ram", 35000, 25, "male", "development"),
                new Employee(103, "Anuj", 50000, 30, "male", "operation"),
                new Employee(101, "Ramesh singh", 45000, 35, "male", "development"));

        employeeList.stream().map(e->e.getEmployeeId()).distinct().forEach(System.out::println);

        //getting count of male employee
        long count = employeeList.stream().filter(e -> e.getGander().equalsIgnoreCase("male")).count();
        System.out.println(count);

        //getting first three employee
        employeeList.stream().limit(3).forEach(System.out::println);

        //collecting first three male employee name
        List<String> maleEmployee = employeeList.stream().filter(e -> e.getGander().equalsIgnoreCase("male"))
                .limit(3).map(e -> e.getEmployeeName()).toList();
        System.out.println("first three male employee name:"+maleEmployee);

        //skip three male employee
        employeeList.stream().filter(e->e.getGander().equalsIgnoreCase("male")).skip(3).forEach(System.out::println);

        //sorting the employee name
        List<String> nameListSorted = employeeList.stream().map(e -> e.getEmployeeName()).sorted().toList();
        System.out.println(nameListSorted);

        //sorting employee object
        List<Employee> employees = employeeList.stream().sorted((o1, o2) -> o1.getEmployeeId() - o2.getEmployeeId()).toList();
        System.out.println(employees);
        //sorting employee object with respect to name
        employeeList.stream().sorted((e1,e2)-> e1.getEmployeeName().compareTo(e2.getEmployeeName())).map(e->e.getEmployeeName()).forEach(System.out::println);

        //collect data of employee min salary
        float minSalary = employeeList.stream().min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get().getSalary();

        System.out.println(minSalary);

        //Find the Average of the salary
        double averageSalary = employeeList.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
        System.out.println("Average salary of all employee: "+averageSalary);
        
        
        //peek() method used to trace the stream data in middle operation
        List<Employee> employeeAge = employeeList.stream().filter(e -> e.getAge() == 25).peek(System.out::println).collect(Collectors.toList());
        System.out.println(employeeAge);
    }



    public static void main(String[] args) {
        //collectEmployeeName();
        //anyMatch();
        //allMatch();
        //createObject();
        //filterStreamOperation();
        getCityName();


    }
}

class Employee {
    private Integer employeeId;
    private String employeeName;
    private float salary;
    private int age;
    private String gander;
    private String departments;

    public Employee(Integer employeeId, String employeeName, float salary, int age, String gander, String departments) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.age = age;
        this.gander = gander;
        this.departments = departments;
    }

    public Employee(Integer employeeId, String employeeName, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gander='" + gander + '\'' +
                ", departments='" + departments + '\'' +
                '}';
    }
}

abstract class ReservedBank {
    private int a;

    static void show() {

    }

    private void print() {

    }

}
