package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Pattern {
	
	
	public static void main(String[] args) {
		pattern();
	}

	private static void pattern() {
			
		String string ="Swiss";
		
		  Character character = string.toLowerCase().chars()
				.mapToObj(e->(char)e)
				.collect(Collectors.groupingBy(c->c,Collectors.counting()))
				.entrySet().stream()
				.map(e->e.getKey())
				.findFirst()
				.orElse(null);
		  
		  Map<Character,Long> map = string.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		  
		  System.out.println(map);
		
		System.out.println(character);
		
		System.out.println();
		
	}

}
