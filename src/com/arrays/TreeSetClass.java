package com.arrays;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<Student21> treeSet = new TreeSet<Student21>();
		System.out.println("===================================");
		treeSet.add(new Student21(101, "Ramu"));
		treeSet.add(new Student21(102, "Anu"));
		treeSet.forEach(System.out::println);
		System.out.println(treeSet);

		Iterator<Student21> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Student21 student21 = (Student21) iterator.next();
			System.err.println(student21);
			System.out.println(student21.getName());
		}
		

	}

}

class Student21 implements Comparable<Student21> {
	
	@Override
	public int compareTo(Student21 o) {

		return this.Id - o.Id;
	}

	public int Id;
	public String name;

	public Student21(int id, String name) {
		super();
		Id = id;
		this.name = name;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student21 [Id=" + Id + ", name=" + name + "]";
	}

}
