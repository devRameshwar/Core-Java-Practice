package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteValueOfSpecificPlace {

    public static void main(String[] args) {

        DeleteValueOfSpecificPlace obj = new DeleteValueOfSpecificPlace();
        //obj.deleteValueOfSpecificPlace();
        obj.removingArrayElimentusingArrayList();

    }

    //Delete Arrays value for Specific Place
    public void deleteValueOfSpecificPlace() {
        int[] arr = {1, 3, 5, 2, 6, 7, 4};
        int[] result= IntStream.range(0, arr.length).filter(i -> i != 4).map(i -> arr[i]).toArray();
        System.out.println(Arrays.toString(result));

    }

    //Removing 4 index value using Array List
    public void removingArrayElimentusingArrayList() {
        int[] arr = {1, 3, 4, 2, 6, 8, 7};
        /*System.out.println("Removing Value using IntStream class");
        IntStream intStream = IntStream.range(0, arr.length).filter(i -> i != 3).map(i -> arr[i]);
        System.out.println(Arrays.toString(intStream.toArray()));*/

        System.out.println("removing index value using ArrayList");
        //changing Arrays to  list
        List<Integer> collect = IntStream.of(arr).boxed().collect(Collectors.toList());
        //Removing Data for Specific place
        collect.remove(5);
        collect.forEach(System.out::println);

        // return the resultant array
        //collecting List to Integer Arrays
        int[] result = collect.stream().mapToInt((Integer::intValue)).toArray();

        System.out.println(Arrays.toString(result));


    }
}
