package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MageTwoList {

	public static void margetwoList() {
		List<FacebookEmployee> employeeList1 = Arrays.asList(new FacebookEmployee(101, "Raju"),
				new FacebookEmployee(102, "Anuj"), new FacebookEmployee(103, "Sima"),
				new FacebookEmployee(104, "Anuj"));

		List<FacebookEmployee> employeeList2 = Arrays.asList(new FacebookEmployee(105, "Ramesh"),
				new FacebookEmployee(106, "Virat"), new FacebookEmployee(107, "Mohan"),
				new FacebookEmployee(108, "Tittu"));

		List<FacebookEmployee> employeeList3 = Arrays.asList(new FacebookEmployee(105, "Ramesh"),
				new FacebookEmployee(106, "Virat"), new FacebookEmployee(107, "Mohan"),
				new FacebookEmployee(108, "Tittu"));

		List<FacebookEmployee> margeList = Stream.of(employeeList1, employeeList2, employeeList3)
				.flatMap(m -> m.stream()).toList();

		margeList.forEach(e -> System.out.println(e));
	}

	public static void main(String[] args) {

		margetwoList();
	}

}

class FacebookEmployee {

	Integer employeeId;

	String name;

	public FacebookEmployee(Integer employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " employeeId=" + employeeId + ", name=" + name;
	}

}
