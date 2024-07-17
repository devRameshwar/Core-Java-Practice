package com.interview;


import java.util.Arrays;

public class ArrayOperation {


    public  static void reverse(){
        String string="Hello";
        char[] charArray = string.toCharArray();
        String s="";
        for (int i = charArray.length-1; i >=0; i--) {
            s=s+charArray[i];
        }
        System.out.println(s);

        StringBuffer stringBuffer = new StringBuffer(string);
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);
        //using Stream
        int i []={2,3,1,5,6,8,10};

      //Arrays.stream(i).distinct().peek(System.out::println).toArray();

        int sum = Arrays.stream(Arrays.stream(i).sorted().toArray()).limit(3).peek(System.out::println).sum();
        //System.out.println(Arrays.toString(array) );
        System.out.println("min sum: "+sum);


    }

    public static void main(String[] args) {
        //reverse();
        check();
    }

    public static void check(){
        String string="Singh";
        String rev="";
        for (int i = string.length()-1; i >=0; i--) {
            System.out.println(string.charAt(i));
            rev =rev+string.charAt(i);
        }
        System.out.println(rev);
    }
}
