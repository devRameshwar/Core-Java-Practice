package com.java8.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;


public class ComparetorSortingWithLambda {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        System.out.println("unsorted order: " + list);
        //by default, it can be sorted in ascending order with Lambda

        Collections.sort(list,(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
        System.out.println("sorted order: "+list);
        //if we want to sort in descending order then
    }
}
