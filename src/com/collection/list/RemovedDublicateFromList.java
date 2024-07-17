package com.collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovedDublicateFromList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Raju");
		list.add("Ramu");
		list.add("Sonu");
		list.add("Raju");
		list.add("Ramu");

		System.out.println("list Before removing duplicate");

		list.forEach(System.out::println);

		System.out.println("list After removing duplicate");

		HashSet<String> set = new HashSet<>();
		set.addAll(list);
		set.forEach(System.out::println);

		// Java 8 Find Duplicate
		System.out.println("Find Duplicate Using Java 8");
		HashSet<String> set2 = new HashSet<>();

		List<String> list2 = list.stream().filter(val -> !set2.add(val)).collect(Collectors.toList());

		list2.forEach(System.out::println);

		// JAVA8: Remove Duplicates
		System.out.println("Remove Duplicates From Java 8 below list: ");

		list.add("Mohit");
		list.add("Jony");
		list.add("Jony");
		HashSet<String> set3 = new HashSet<>();
		list.forEach(System.out::println);
		System.out.println("Collect all List remove dublicate");
		list.stream().filter(remove -> set3.add(remove)).collect(Collectors.toList()).forEach(System.out::println);

	}

}
