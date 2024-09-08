package com.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
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

	public static void oparation() {
		List<Integer> numbers = Arrays.asList(2, 0, 1, 3, 5, 6, 8, 7, 10, 9);

		Integer integer = numbers.stream().collect(Collectors.maxBy((e1, e2) -> e1 - e2)).get();
		System.out.println(integer);

		List<Integer> sort = numbers.stream().sorted((e1, e2) -> e2 - e1).collect(Collectors.toList());
		System.out.println(sort);

		int averag = numbers.stream().collect(Collectors.averagingInt(e -> e)).intValue();
		System.out.println(averag);

		IntSummaryStatistics sum = numbers.stream().collect(Collectors.summarizingInt(e -> Integer.sum(0, e)));
		System.out.println(sum.getSum());

		String string = "RAameshwar";

		Entry<Character, Long> entry = string.toLowerCase().chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		System.out.println(entry.getKey()+ "\t"+ entry.getValue());

	}

	public static void main(String[] args) {

		// margetwoList();
		oparation();

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
