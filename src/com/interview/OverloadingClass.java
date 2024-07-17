package com.interview;

public class OverloadingClass {

    public void showNumber(int number ){
        System.out.println("int: "+number);
    }
    public void showNumber(Integer number ){
        System.out.println("Integer: "+number);
    }

    public static void main(String[] args) {
        OverloadingClass object = new OverloadingClass();

        object.showNumber(10);//int: 10

        Integer number=5;
        int num=15;
        object.showNumber(number);//Integer: 5
        object.showNumber(num);//int: 15

    }
}
