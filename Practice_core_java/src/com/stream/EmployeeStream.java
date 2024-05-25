package Practice_core_java.src.com.stream;

import java.util.ArrayList;

public class EmployeeStream {

    //collect Employee name using Stream
    public void collectEmployeeName(){
        ArrayList<Employee> employeeList = new ArrayList<>();

    }

    public static void main(String[] args) {


    }
}

class Employee {
    private Integer employeeId;
    private String employeeName;
    private float salary;

    public Employee(Integer employeeId, String employeeName, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
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
