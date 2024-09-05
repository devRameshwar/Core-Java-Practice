package com.arrays;

import java.util.Arrays;

public class Index {

	public static int index() {
		int arr[] = { 4, 10, 7, 8, 14, 6 };

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		return arr[2];
	}

	public static void main(String[] args) {

		System.out.println(index());
	}

}
