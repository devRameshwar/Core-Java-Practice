package Practice_core_java.src.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
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



    public static void main(String[] args) {
        //collectEmployeeName();
        //anyMatch();
        //allMatch();
        //createObject();
        filterStreamOperation();

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
}

abstract class ReservedBank {
    private int a;

    static void show() {

    }

    private void print() {

    }

}
