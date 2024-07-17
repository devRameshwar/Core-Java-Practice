package com.methodReferencing;

interface ReverseString {
    StringBuffer reverse();
}

public class ReferenceClass {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Good Morning");
        //reverse is a non-static method then we are called with help of StringBuffer class object reference
        ReverseString reverseString = stringBuffer::reverse;

        System.out.println(reverseString.reverse());
    }
}
