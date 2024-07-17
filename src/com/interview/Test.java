package com.interview;

import java.util.stream.Collectors;

public class Test {

    public static void count(){
        String string="Rameshwar";

        //Count the character occurrence of a String
        long count = string.chars().filter(ch -> ch == 'a').count();

        //removing Duplicate Character to String
        String collect = string.chars().distinct().
                mapToObj(e -> String.valueOf((char) e))
                .collect(Collectors.joining());

        //Stored String
        String sortedString = string.chars().sorted()
                .mapToObj(e -> String.valueOf((char) e))
                .collect(Collectors.joining());

        //Reverse of a String
        String reverse="";
        for (int i = string.length()-1; i >=0 ; i--) {
            reverse=reverse+string.charAt(i);
        }
        System.out.println(reverse);


        System.out.println(sortedString);
        System.out.println(collect);
        System.out.println(count);
    }

    public static void palindromeString(){

    }

    public static void main(String[] args) {
        count();
    }
}
