package com.practice;

import java.util.Scanner;

public class EmployeeList {

    public static void printEmployeeList(Employee21[] employees) {
        for (Employee21 employee : employees) {
            System.out.println(employee);
        }
    }

    //Sorting employee with respect to Employee I'd
    public static void sortingEmployeeList(Employee21[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].id > employees[j].id) {
                    Employee21 temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        //printing employee with help of print method
        EmployeeList.printEmployeeList(employees);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of employees: ");
        Employee21[] employees = new Employee21[scanner.nextInt()];

        System.out.println("Enter " + employees.length + " employees: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Employee Id #" + (i + 1) + " Employee " + ": ");
            int employeeId = scanner.nextInt();
            System.out.print("Employee Name #" + (i + 1) + " Employee " + ": ");
            String employeeName = scanner.next();
            System.out.print("Employee destination #" + (i + 1) + " Employee " + ": ");
            String employeeDestination = scanner.next();
            System.out.print("Employee Salary #" + (i + 1) + " Employee " + ": ");
            double employeeSalary = scanner.nextDouble();
            //Storing data in Array
            employees[i] = new Employee21(employeeId, employeeName, employeeDestination, employeeSalary);

        }
        //EmployeeList.printEmployeeList(employees);
        sortingEmployeeList(employees);

    }

}

class Employee21 {
    int id;
    String name;
    String destination;
    double salary;

    public Employee21(int id, String name, String destination, double salary) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + '\'' + ", destination='" + destination + '\'' + ", salary=" + salary;
    }
}
