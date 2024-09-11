package com.test;

import java.util.Scanner;

public class ArmstrangNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = scanner.nextInt();

		int armstrongNumber = armstrongNumber(number);

		if (armstrongNumber == number) {
			System.out.println("A Armstrong " + number);
		} else {
			System.out.println("NOT a Armstrong: " + number);
		}
	}

	private static int armstrongNumber(int i) {

		int disiteCount = 0;
		int disite = i;
		while (i != 0) {
			i = i / 10;
			++disiteCount;
		}
		 //System.out.println(disiteCount+"\t"+i+"\t"+disite);

		int sum = 0;

		for (int j = 0; j < disiteCount; j++) {
			int number = disite % 10;
			// System.out.println(number);
			int pow = (int) Math.pow(number, disiteCount);
			disite = disite / 10;
			// System.out.println(disite);
			sum = sum + pow;
		}
		System.out.println(sum);

		return sum;

	}

}
