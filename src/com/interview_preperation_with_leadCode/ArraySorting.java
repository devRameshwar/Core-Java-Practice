package com.interview_preperation_with_leadCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySorting {
	
	public static void removedElements() {
		int [] a= {1,2,4,5,2,2};
		System.out.println("Method is called....");
		long count = Arrays.stream(a).boxed().filter(e->e.equals(2)).count();
		System.out.println(count);
   Object[] array = Arrays.stream(a).boxed().distinct().toArray();
	    
	    
	     
	}

	public static void main(String[] args) {
		removedElements();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array...");
		int n = sc.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>(n);

		if (n >= 1) {
			System.out.println("Enter " + n + " elements in array element");
			for (int i = 0; i < n; i++) {
				arrayList.add(sc.nextInt());
			}
		} else {
			System.out.println("ArrayList size not less then 1");
		}
		System.out.println("Enter key Elemets to removed: ");
		int k = sc.nextInt();
		arrayList.forEach(System.out::println);
		removedGivenKeyNumber(k, arrayList);
	}

	private static void removedGivenKeyNumber(int i, ArrayList<Integer> arrayList) {
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() == i) {
				iterator.remove();

			}
		}
		System.out.println(arrayList);
		
		
	}

}
