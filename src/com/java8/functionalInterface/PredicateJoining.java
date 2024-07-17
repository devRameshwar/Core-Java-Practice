package com.java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void check(Predicate<Integer> predicate, int[] a) {
        /*extracting the Array value */
        for (int x : a) {
            /*passing one-one value in test method getting return true or false*/
            if (predicate.test(x)) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {0, 2, 3, 5, 10, 15, 4, 40, 25, 35};
        /*Note checking the array value is grater Then 10 or even number*/
        Predicate<Integer> predicate = i -> i > 10;

        Predicate<Integer> predicate1 = i -> i % 2 == 0;

        System.out.println("checking grater then 10");
        check(predicate, a);/*output: 15 40 25 35*/

        System.out.println("checking even number ");
        check(predicate1, a);//output 0 2 10 4 40

        System.out.println("checking number grater then 10");
        check(predicate.negate(), a);//output 0 2 3 5 10 4

        System.out.println("checking number Not a even ");
        check(predicate1.negate(), a);//output 0 2 3 5 10 4

        System.out.println("checking number grater then 10 or even");
        check(predicate.or(predicate1), a);/*output 0  2 10 15 4 40 25 35*/

        System.out.println("checking number grater then 10 and even");
        check(predicate.and(predicate1), a);//output 40
    }
}



