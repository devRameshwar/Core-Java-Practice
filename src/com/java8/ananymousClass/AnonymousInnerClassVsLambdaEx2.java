package com.java8.ananymousClass;
@FunctionalInterface
interface Demo{
    void show();
}
public class AnonymousInnerClassVsLambdaEx2 {
    int a=10;
    public void print1(){
        int b=20;//Note if we are declared a local variable within the lambda expression, it is By default final variable
        Demo demo=()->{
            a=40;//it will always change
            System.out.println(a);
            System.out.println(b);
            //if we want to change the value of local variable b, then we're getting compiled time error
            // b=30;//we're getting Compiled time error
        };
        //show method is called.
        demo.show();
    }

    public static void main(String[] args) {
        AnonymousInnerClassVsLambdaEx2 ex2 = new AnonymousInnerClassVsLambdaEx2();
        ex2.print1();
    }
}
