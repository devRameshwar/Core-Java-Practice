package com.arrays;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DevEmployeeOparation {

	public static void sortingWithSalary(List<DevEmployee> employees) {

		Optional<DevEmployee> findFirst = employees.stream()
				.sorted((e1, e2) -> (int) e2.getSalary() - (int) e1.getSalary()).skip(2).findFirst();
		System.out.println(findFirst.get());

	}

	public static void filterEmployee(List<DevEmployee> employees) {

		List<DevEmployee> list = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("female")).toList();

		// list.forEach(System.out::println);

		List<String> employeeName = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("male"))
				.map(e -> e.getName()).toList();
		// employeeName.forEach(System.out::println);

		DevEmployee maxSalary = employees.stream().filter(e -> e.getGender().equals("female"))
				.sorted((e1, e2) -> (int) e2.getSalary() - (int) e1.getSalary()).findFirst().get();

		System.out.println(maxSalary);

		DevEmployee minSalary = employees.stream().filter(e -> e.getGender().equals("female"))
				.sorted((e1, e2) -> (int) e1.getSalary() - (int) e2.getSalary()).findFirst().get();
		System.out.println(minSalary);
	}

	public static void main(String[] args) {

		List<DevEmployee> employeeList = Arrays.asList(
				new DevEmployee(103, "Anuj", 10000.0, LocalDate.of(2016, 9, 11), "male", "Software developer"),
				new DevEmployee(105, "Arati", 20000.0, LocalDate.of(2015, 11, 14), "female", "Tester"),
				new DevEmployee(102, "Rajan", 15000.0, LocalDate.of(2014, 7, 13), "male", "Tester"),
				new DevEmployee(106, "Sivangi", 21000.0, LocalDate.of(2017, 8, 22), "female", "Software developer"),
				new DevEmployee(107, "Arun", 15000.0, LocalDate.of(2009, 11, 23), "male", "Tester"));

		// sortingWithSalary(employeeList);
		filterEmployee(employeeList);
	}

}

class DevEmployee {
	int id;
	String name;
	double salary;
	LocalDate joiningDate;
	String gender;
	String jobRole;

	public DevEmployee(int id, String name, double salary, LocalDate joiningDate, String gender, String jobRole) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.gender = gender;
		this.jobRole = jobRole;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	@Override
	public String toString() {
		return "DevEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate
				+ ", gender=" + gender + ", jobRole=" + jobRole + "]";
	}

}
