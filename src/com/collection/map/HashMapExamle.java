package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 

public class HashMapExamle {

	public static void iterateValue(HashMap<Integer, String> hashMap) {

		//Java 8 forEach loop
		
		System.out.println("Java 8 forEach loop ");
		hashMap.forEach((key, value) -> System.out.println("[key]: " + key + " [value]: " + value));

		//Iterating using  for loop
		
		System.out.println("For entry set: ");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("[key] " + entry.getKey() + " [value] " + entry.getValue());
		
			//Iterating using entrySet().iterator();
			
			System.out.println("Iterator: ");
			Iterator<Entry<Integer,String>>iterator=hashMap.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry<Integer,String> next = iterator.next();
				System.out.println(" [key]: " +next.getKey()+" [Value]: " +next.getValue());
			}

		}

	}

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(101, "Rameshwar");
		hashMap.put(102, "Anil");
		hashMap.put(103, "Sivi ");
		hashMap.put(104, "Aman");

		iterateValue(hashMap);
	}

}
