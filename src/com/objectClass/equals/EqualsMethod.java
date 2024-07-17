package com.objectClass.equals;

public class EqualsMethod {

    //String class vs String class equals method
    public static void stringEqulasAndEqualsOperator(){
        /*String class equals method  already overriding so its checks String
         content only */
        String s1="hi";
        String s2="hi";
        //here only one object create in string class hi and s1 & s2 reflecting hi only
        // so s1 & s2 hash code are same

        System.out.println(s1.equals(s2));// it returns True only

        System.out.println(s1==s2);// true bcoz == operator check Hash code
        System.out.println(s1.hashCode());// hash code = 3329
        System.out.println(s2.hashCode());//hash code = 3329
        //here two object created with same content

        String s3=new String("Hello");
        String s4= new String("Hello");

        Integer a=50;
        Integer b=50;

        Integer c=500;
        Integer d=500;
        System.out.println("a and b equals(): "+a.equals(b));//true it check value
        System.out.println(a==b);//true
        System.out.println("c and d equals(): "+a.equals(b));// true becoz it check value
        System.out.println(c==d);//false

        System.out.println(s3==s4);//false
        /*The == operator checks whether two object references point to the same memory location.
                In other words, it checks if the two references are pointing to the exact same object instance.*/

        System.out.println(s3.hashCode());// hashcode =69609650
        System.out.println(s4.hashCode());// hashcode =69609650
        System.out.println(s3.equals(s4));//outPut: true
        /*In the String class specifically, the equals() method
        checks whether the contents of two strings are the same, character by character.*/

    }

    public static void main(String[] args) {

        stringEqulasAndEqualsOperator();

    }
}
