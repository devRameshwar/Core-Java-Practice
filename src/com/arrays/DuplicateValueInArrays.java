package com.arrays;

public class DuplicateValueInArrays {

    public static void main(String[] args) {
        new DuplicateValueInArrays().removeDuplicateValueInArrays();
    }

    //Remove Duplicate value in Arrays
    public void removeDuplicateValueInArrays() {
        int[] arr = {0, 1, 4, 5, 7, 8, 9, 10, 2, 6, 3, 0, 2, 3, 2, 10};

        for (int i : arr) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}
