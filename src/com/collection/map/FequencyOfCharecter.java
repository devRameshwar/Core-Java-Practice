package com.collection.map;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FequencyOfCharecter {

	public static void main(String[] args) {

		charCount("hello");

		removedDublicate("Ramesssshwar");
	}

	private static void removedDublicate(String string) {

		String string2 = string.chars().distinct().mapToObj(s -> String.valueOf((char) s))
				.collect(Collectors.joining());
		System.out.println(string2);

		String collect = string.chars().boxed().sorted((e1, e2) -> e2 - e1)
				.map(e -> String.valueOf((char) e.intValue())).collect(Collectors.joining());
		System.out.println("=============>  " + collect);

		long count = string.chars().boxed().filter(e -> e == 's').count();
		System.out.println(count);

		HashMap<Character, Boolean> hashMap = new HashMap<Character, Boolean>();

		String nonDublicate = "";

		for (char c : string.toCharArray()) {
			if (!hashMap.containsKey(c)) {
				hashMap.put(c, true);
				nonDublicate = nonDublicate + c;
			}

		}
		System.out.println(nonDublicate);
	}

	private static void charCount(String string) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		char[] charArray = string.toCharArray();

		for (char c : charArray) {

			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}
		}
		System.out.println(hashMap);

	}

}
