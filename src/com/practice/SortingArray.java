package com.practice;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 4, 6, 5};
        int[] b =new int[a.length];

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        }
}
