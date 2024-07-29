package com.collection.map;

import java.util.TreeMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {

		//test1();
		
		test2();

	}

	private static void test2() {
		TreeMap<Student,Integer> map = new TreeMap<Student,Integer>();
		
		map.put(new Student(100, "Arun"),100);
		System.out.println(map);
	}

	private static void test1() {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(11, "Ramu");
		map.put(12, "Anu");
		System.err.println(map);
		String string = map.get(11);
		System.out.println(string);
	}

}

class Student implements Comparable<Student> {

	Integer studentId;
	String studentName;

	public Student(Integer studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.studentId-o.studentId;
	}

}
