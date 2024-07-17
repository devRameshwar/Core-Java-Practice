package Practice_core_java.src.com.java8.functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomizedClass {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "Mohen"), new Employee(104, "Sivi"),
                new Employee(105, "Arun"), new Employee(102, "Anubav"), new Employee(103, "Raj"));

        //printing as an employee object
        System.out.println(employeeList);//[employeeId=101, employeeName='Mohen, employeeId=104, employeeName='Sivi, employeeId=105, employeeName='Arun, employeeId=102, employeeName='Anubav, employeeId=103, employeeName='Raj]

        //sorting employee with employee id
        Collections.sort(employeeList,(e1,e2)->(e1.employeeId<e2.employeeId)?1:(e1.employeeId>e2.employeeId)?-1:0);
        System.out.println(employeeList);//[employeeId=105, employeeName='Arun, employeeId=104, employeeName='Sivi, employeeId=103, employeeName='Raj, employeeId=102, employeeName='Anubav, employeeId=101, employeeName='Mohen]
    }
}

class Employee {
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return  "employeeId=" + employeeId + ", employeeName='" + employeeName  ;
    }
}