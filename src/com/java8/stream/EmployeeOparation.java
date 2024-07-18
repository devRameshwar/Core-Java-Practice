package com.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EmployeeOparation {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee("Ramesh", 24, Arrays.asList("Agara", "Varanasi")),
				new Employee("Aurag", 21, Arrays.asList("Kanpur", "Banda")),
				new Employee("Syam", 26, Arrays.asList("Delhi", "Kanpur")));
		
		oparation(employeeList);
	}

	private static void oparation(List<Employee> employeeList) {
		
		List<String> list = employeeList.stream().map(e->e.getAddress()).flatMap(Collection::stream).sorted((a1,a2)->a2.length()-a1.length()).toList();
		
		System.out.println(list);
		
	}

}

class Employee {
	public String employeeName;

	public Integer age;

	public List<String> address;

	public Employee(String employeeName, Integer age, List<String> address) {
		this.employeeName = employeeName;
		this.age = age;
		this.address = address;
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

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", age=" + age + ", address=" + address + "]";
	}

}
