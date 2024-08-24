package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class Test2 {

	public static void main(String[] args) {

		// Test2 test2=Test2.bulder().id(12).build();

		// test();

		ocurence();

	}

	private static void ocurence() {
		String string = "Pavan Pratap Singh";

		char[] charArray = string.toLowerCase().toCharArray();

		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (char c : charArray) {
			if (c != ' ') {
				hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(hashMap);

	}

	private static void test() {
		int[] arr = { 5, 7, 2, 9, 1, 3, 8 };

		Optional<Integer> findFirst = Arrays.stream(arr).boxed().sorted((e1, e2) -> e2 - e1).skip(1).findFirst();

		System.out.println(findFirst.get());

	}

}
