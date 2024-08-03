package com.arrays;

import java.util.Iterator;
import java.util.List;

public class CheckCharOrAlfabet {

	public static void main(String[] args) {
		//check();
		reverce();
	}

	private static void reverce() {
		 String string ="RamuSingh";
		 String rev="";
		 for (int i = string.length()-1; i >=0; i--) {
			rev=rev+ string.charAt(i);
		}
		 System.out.println(rev);
		 
		  
	}

	private static void check() {

		String string = "asdfg13";

		long count = string.chars().boxed().filter(a -> a >= 64).count();
		List<Integer> list = string.chars().filter(e -> e < 64).mapToObj(e -> (int) e).toList();

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer ch = iterator.next();
			int i = ch;
			char ch1 = (char) i;
			System.out.println(ch1);
		}

		// System.out.println(list);

		System.out.println(count);
	}

}
