package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    public static int[] sortingOfArray(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int[] a = new int[sc.nextInt()];

        //int c[]={1,2,3};

        System.out.println(Arrays.toString(a));
        System.out.println("length of array: " + a.length);

        System.out.println("Enter " + a.length + " elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[] ints = Student.sortingOfArray(a);

        // System.out.println(Arrays.toString(b));

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

    }


}
