package com.java8.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ComparetorSorting {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        System.out.println("unsorted order: " + list);
        //by default, it can be sorted in ascending order
        Collections.sort(list);
        System.out.println("sorted order: "+list);

    }

}
