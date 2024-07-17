package com.interview_preperation_with_leadCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveElement {

    private static int removeElement(int[] arr, int val) {
        List<Integer> filteredList = Arrays.stream(arr)
                .filter(num -> num != val)
                .boxed()
                .collect(Collectors.toList());

        // Copy the filtered elements back to the original array
        for (int i = 0; i < filteredList.size(); i++) {
            arr[i] = filteredList.get(i);
        }

        // Return the number of elements which are not equal to val
        return filteredList.size();
    }

    public static void main(String[] args) {

        int[] arr = {3,2,2,3};

        int i = removeElement(arr, 4);

        System.out.println(i);


    }


}
