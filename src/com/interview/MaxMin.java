package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {

	public static void main(String[] args) {
		max();
	}

	private static void max() {
		int[] a = { 1, 2, 3, 4, 5, 6, 6 };

		int i = Arrays.stream(a).max().getAsInt();
		System.out.println(i);

		//List<Integer> collect = Stream.of(a).distinct().collect(Collectors.toList());

		  List<Integer> collect = Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
		
		System.out.println(collect);
		
		int asInt = Arrays.stream(a).min().getAsInt();
		
		

	}
}
