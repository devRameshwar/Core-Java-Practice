package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		sort();

		arr();
	}

	private static void arr() {
		Integer[] arr = { 91, 18, 87, 9, 1, 2, 5, 6, 8, 4, 5, 76, 43, 23 };
		int k = 4;
		List<Integer> list = Arrays.asList(arr);
		Collections.rotate(list, -k);

		Integer[] array = list.toArray(new Integer[0]);

		System.out.println(Arrays.toString(array));

	}

	private static void sort() {

		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		List<Integer> collect = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

		int[] array = Arrays.stream(arr).filter(n -> n < 0).toArray();

		Arrays.sort(array);

		// System.out.println(Arrays.toString(array));

		System.out.println(collect);

	}

}
