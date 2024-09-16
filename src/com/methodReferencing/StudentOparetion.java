package com.methodReferencing;

import java.util.ArrayList;
import java.util.function.Function;

@FunctionalInterface
interface Student22{
	String getName(String name);
}

public class StudentOparetion {

	public static void main(String[] args) {
		
		Student22 student22=(name)->{
			return name;
		};
		String name = student22.getName("Rahul");
		System.out.println(name);
		
		Student21 student21 = new Student21();
		
		Function<String, String> function= student21::studentName;	
		String apply = function.apply("Rameshwar Singh");
		
		System.out.println(apply);
		
		ArrayList<?> arrayList = new ArrayList<>();
		

	}

}

class Student21 {

	public String studentName(String name) {
		return name;
	}
}
