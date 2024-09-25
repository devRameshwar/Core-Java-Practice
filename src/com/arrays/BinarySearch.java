package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinarySearch {

	private static int binarySearch(int[] arr, int target) {

		// Sorting the array
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			// Calculate the mid-point index
			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				return mid; // Target found, return index
			} else if (arr[mid] < target) {
				low = mid + 1; // Target is in the right half
			} else {
				high = mid - 1; // Target is in the left half
			}
		}

		return -1; // Target not found
	}

	private static void reversePattern() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		for (int i = number; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print(i + "\t");
			}
			System.out.println();

		}

	}

	private static void reversePattern2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = i; j <= number; j++) {

				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}

	private static void reverseString() {
		String string = "Rameshwar";

		String string2 = IntStream.range(0, string.length()).mapToObj(i -> string.charAt(string.length() - 1 - i))
				.map(i -> (char) i + "").collect(Collectors.joining());

		System.out.println(string2);

		char[] array = string.toCharArray();
		String reverse = "";
		for (int j = array.length - 1; j >= 0; j--) {
			reverse += array[j];
		}
		System.out.println(reverse);

		String reverse1 = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse1 += string.charAt(i);
		}
		System.out.println(reverse1);

		StringBuilder builder = new StringBuilder(string);
		System.out.println(builder.reverse());

		StringBuffer buffer = new StringBuffer(string);
		System.out.println(buffer.reverse());

		StringBuffer reverse2 = buffer.reverse();

		Function<StringBuffer, StringBuffer> function = StringBuffer::reverse;

		StringBuffer apply = function.apply(new StringBuffer("Rohan"));
		
		System.out.println(apply);
		
		
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 2, 4, 10 };
		int target = 10;

		int index = binarySearch(arr, target);

		if (index == -1) {
			System.out.println("Target not found: " + target);
		} else {
			System.out.println("Target found at index: " + index);
		}

		// reversePattern method

		// reversePattern();
		// reversePattern2();
		reverseString();

	}

}
