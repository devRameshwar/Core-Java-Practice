package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTree {
	
  public static void main(String[] args) {
	  number();
}

private static void number() {

	List<Integer> list = Arrays.asList(5,6,7,30, 25,24);
	List<Integer> list2 = list.stream().filter(e->e%2!=0).map(n->n*5).filter(n->n%2!=0).collect(Collectors.toList());
	
	System.out.println(list2);
	int sum=0;
	for(int i:list2) {
		sum =i+sum;
	}
	System.out.println(sum);
	
	
}
	
	
}

