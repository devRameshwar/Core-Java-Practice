package com.arrays;

import java.util.List;
import java.util.stream.Stream;

public class Charclass {

    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c'};
        int[] arr = {1, 3, 4, 5};
        String s = "Ramu";
        //String s=c.toString();

        Stream.of(s).forEach(System.out::println);

        String string = "jjava is a programming language";
        char firstUniqueChar = string.chars().mapToObj(m -> (char) m).filter(i -> string.indexOf(i) == string.lastIndexOf(i)).findFirst().orElseThrow(null);
        System.out.println(firstUniqueChar);

        List<Integer> integerList = string.chars()
                .mapToObj(m -> m)
                .map(e -> e.compareTo(36))
                .toList();
        System.out.println(integerList);

    }
}
