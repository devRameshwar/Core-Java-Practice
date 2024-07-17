package com.java8.lamdaExpression;
@FunctionalInterface
interface Wish{
    void wish(String massage);
}
public class LambdaMethodWithArgumetNoReturnType {
    public static void main(String[] args) {
        //Creating a function no argumets with
        Wish obj=massage -> System.out.println(massage);
        //output: Good Morning Rameshwar Singh

        //calling wish method
        obj.wish("Good Morning Rameshwar Singh");
    }
}
