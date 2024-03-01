package com.collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class HashMapwithEmployee {

    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();
        // Adding data into HashMap
        map.put(new Employee(101, "Ashok"), "Employee");
        map.put(new Employee(102, "Sivi"), "Employee");
        map.put(new Employee(103, "Golu"), "HR");
        map.put(new Employee(104, "Gyani"), "Manager");
        // System.out.println(map);

        // Iterating map Data with java 8
        map.forEach((key, value) -> {
            // System.out.println("[key] "+key.getEmployeeId()+" [value] "+value);
            System.out.println(key.getEmployeeName() + "\t" + value);

        });
        ArrayList<Object> employeeList = new ArrayList<>();
        map.forEach((key, value) -> {
            employeeList.add(key.getEmployeeName());
        });
        System.out.println(employeeList);
        System.out.println("Sorting List of employee==> ");
        Comparator<Employee> comparator = (Employee e1, Employee e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName());
        // Collections.sort(employeeList, comparator.reversed());
        employeeList.forEach(System.out::println);
    }

}

class EmployeeSort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return 0;
    }

}

class Employee {

    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
