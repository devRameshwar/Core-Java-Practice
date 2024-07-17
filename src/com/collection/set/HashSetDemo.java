package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Ram");
		set.add("Syam");
		set.add("Sivi");
		set.add("Abhi");
		set.add("Sivi");
		// Set Always maintain Order
		set.forEach(System.out::println);

		// Sorting Value of Set we can change into TreeSet
		System.out.println("Sorted Set..");
		TreeSet treeSet = new TreeSet(set);

		// TreeSet Always contains the object in Sorted order
		treeSet.forEach(System.out::println);

	}

}
