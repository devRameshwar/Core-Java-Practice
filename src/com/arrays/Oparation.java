package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oparation {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 2, 3, 6, 8, 2, 5);

		long sum = arr.stream().collect(Collectors.summarizingInt(e -> e.sum(0, e))).getSum();

		System.out.println(sum);

		List<Integer> list = arr.stream().filter(e -> e % 2 != 0).toList();

		System.out.println(list);

		List<Student33> asList = Arrays.asList(new Student33("Ramesh", Arrays.asList("varanasi", "Hyd", "bang")),
				new Student33("suresh", Arrays.asList("varanasi", "Hyd", "bang")),
				new Student33("anul", Arrays.asList("varanasi", "bang")),
				new Student33("arpit", Arrays.asList("varanasi", "bang")));
		
		List<String> list2 = asList.stream().flatMap(e->e.getAddess().stream().filter(n->n.equals("Hyd"))).toList();
		System.out.println(list2);

	}

}

class Student33 {
	String name;
	List<String> addess;

	public Student33(String name, List<String> addess) {
		super();
		this.name = name;
		this.addess = addess;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddess() {
		return addess;
	}

	public void setAddess(List<String> addess) {
		this.addess = addess;
	}

	@Override
	public String toString() {
		return "Student33 [name=" + name + ", addess=" + addess + "]";
	}

}
