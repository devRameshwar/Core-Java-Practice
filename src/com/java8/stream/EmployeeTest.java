package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
	
	public static void main(String[] args) {
		sortEmployeeNameLength();
	}

	private static void sortEmployeeNameLength() {
		
		List<GoogleEmployee> googleEmployeeList = Arrays.asList(new GoogleEmployee(101, "Anuj", 234098.90),
				new GoogleEmployee(102, "Sivangi", 2398.90),
				new GoogleEmployee(104, "Anu", 23411.90),
				new GoogleEmployee(103, "Arjit", 23098.90));
		List<String> list = googleEmployeeList.stream().map(e->e.getEmployeeName())
				.sorted((e1,e2)->e2.length()-e1.length()).toList();
		list.forEach(System.out::println);
	}

}

class GoogleEmployee {

	public Integer employeeId;
	public String employeeName;
	public Double salary;

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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	public GoogleEmployee(Integer employeeId, String employeeName, Double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

}