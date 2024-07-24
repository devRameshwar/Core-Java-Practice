package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> asList = Arrays.asList(new Employee(101, "Rameshwar", 100000.99d), new Employee(102, "Rameshwar", 90000.99d),
				new Employee(103, "Anubhav", 110000.99d), new Employee(101, "Swati", 130000.99d),
				new Employee(101, "Krishna", 180000.99d));
		
		asList.sort(new Employee());
		
		asList.forEach(System.out::println);
		
		HashSet<Object> hashSet = new HashSet<>();

	}
}

class Employee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o2.getName().compareTo(o1.getName());
	}

	Integer id;
	String name;
	Double salary;

	public Employee(Integer id, String name, Double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
