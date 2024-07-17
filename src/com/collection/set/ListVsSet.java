
package com.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {

	public static void main(String[] args) {

		System.out.println("+++++++++++++++++++++++List++++++++++++++++++++++++++");

		/*
		 * List<String> list = Arrays.asList("Aman", "Kausik", "Sivi", "Abhinav",
		 * "Sonam", "Anil");
		 * 
		 * list.forEach(System.out::println);
		 * 
		 * System.out.println(
		 * "____________________________________________________________");
		 */

		List<String> list2 = new ArrayList();
		list2.add("Sivangi");
		list2.add("Rameshwar");
		list2.add("Ankur");
		list2.add("Seema");
		// List maintain Insertion order : Internally used ArrayList
		list2.forEach(System.out::println);
		// Adding List Specific place
		list2.add(2, "Singh");
		System.out.println("/n Adding List Specific place ");
		list2.forEach(System.out::println);

		System.out.println("++++++++++++++++++Set+++++++++++++++++++++++++\n");

		Set<String> set = new HashSet();
		set.add("Deepak");
		set.add("Ashok");
		set.add("Aman");
		set.add("Manish");
		// Set does not maintain Insertion : Internally used HashSet
		set.forEach(System.out::println);

	}

}
