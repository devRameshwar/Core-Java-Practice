package com.java8.function;

import java.util.function.Function;

public class FunctionInterfaceTest {
    public static void main(String[] args) {
        /*Here find the length of String we're taking a string & return its length */
        Function<String,Integer> function=s->s.length();
        System.out.println(function.apply("Rameshwar Singh"));
        System.out.println(function.apply("Varanasi"));
    }
}
