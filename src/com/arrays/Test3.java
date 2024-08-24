package com.arrays;

import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {

		List<Employee23> list = Arrays.asList(new Employee23("Ramu", 123.22), new Employee23("Anuj", 124.22),
				new Employee23("Raju", 121.22));

		Employee23 employee23 = list.stream().sorted((e1, e2) -> (int) e2.getSalary() - (int) e1.getSalary())
				.findFirst().get();
		System.out.println(employee23);
	}

}

class Employee23 {
	String name;
	double salary;

	public Employee23(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee23 [name=" + name + ", salary=" + salary + "]";
	}

}
