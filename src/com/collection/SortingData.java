package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortingData {

	public static void sortStringData() {

		List<String> list = Arrays.asList("ramu", "Annu", "bandana", "Zaheer", "alluArjun");

		List<String> name = list.stream().filter(e -> e.startsWith("A")).toList();
		System.out.println(name);
		System.out.println("-----------------------------------");
		List<String> sortedName = list.stream().sorted((s1, s2) -> s2.compareTo(s1)).toList();
		System.out.println(sortedName);

		System.out.println("---------------------------------------------");

		List<String> sortWithLength = list.stream().sorted((s1, s2) -> s2.length() - s1.length()).toList();
		System.out.println(sortWithLength);

	}

	public static void operation() {
		List<List<String>> cities = new ArrayList<>();
		cities.add(new ArrayList<>(Arrays.asList("Paris", "London")));
		cities.add(new ArrayList<>(Arrays.asList("New York", "Berlin")));

		List<String> modifiedList = cities.stream().flatMap(Collection::stream).map(String::toUpperCase)
				.collect(Collectors.toList());

		modifiedList.forEach(System.out::println);
	}

	public static void main(String[] args) {
		//sortStringData();
		operation();

	}

}

