package com.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionReverceOrder {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(101, "Rameshwar", "Varanasi"),
				new Employee(105, "Sivangi", "Jaunpur"), new Employee(103, "Anuj", "Payagraj"),
				new Employee(102, "Ashok Singh", "Agara"), new Employee(104, "Arjun", "Lalpur"));
		System.out.println("++++++++++++++++++Printing Employee List Astise+++++++++++++++++++++++++++");
		list.forEach(System.out::println);

		System.out.println("\nEmployees sorted by employee id : Descending Order");
		// Sorting employees in descending order of employee id using a Comparator

		// Collections.sort(list, Collections.reverseOrder((e1, e2) -> e1.employeeId -
		// e2.employeeId));
		// list.forEach(System.out::println);

		System.out.println("\nEmployees sorted by employee Name : Descending Order");

		// Java 8 Format:

		// Sorting employees in descending order of employee Name
		/*
		 * Comparator<Employee> sortByName=(Employee e1, Employee
		 * e2)->e1.getEmployeeName().compareTo(e2.getEmployeeName());
		 * Collections.sort(list,sortByName.reversed());
		 * list.forEach(System.out::println);
		 */

		Collections.sort(list, (o1, o2) -> o1.getEmployeeName().compareTo(o2.getEmployeeName()));
		list.forEach(System.out::println);

		// Sorting employees in descending order of employee id using java 8
		System.out.println("Sorting employees in descending order of employee id using java 8");
		Collections.sort(list, (e1, e2) -> e1.getEmployeeId() - e2.getEmployeeId());
		list.forEach(System.out::println);

		// Sorting employees in descending order of employee Address
		System.out.println("\nEmployees sorted by employee Address : Descending Order");
		Comparator<Employee> compareByAddress = (o1, o2) -> {
			// we can write block here

			return o1.getAddress().compareTo(o2.getAddress());
		};
		Collections.sort(list, compareByAddress.reversed());
		list.forEach(System.out::println);

	}

}

class SortById implements Comparator<Employee> {

	// Comparator Interface we can implements override the compare method and
	// compare the object

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeId() - o2.getEmployeeId();
	}

}

class Employee {

	Integer employeeId;
	String employeeName;
	String address;

	public Employee(Integer employeeId, String employeeName, String address) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return employeeId + "\t" + employeeName + "\t" + address;
	}

}
