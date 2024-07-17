package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList  {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Aman", "Rajan", "Baldev", "Baba", "Mahadev"));
		long count = Arrays.asList("Bhola","Seema","Rani").stream().filter(b->b.startsWith("B")).count();
		System.out.println(count);
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
