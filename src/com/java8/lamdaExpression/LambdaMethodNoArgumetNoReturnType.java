package com.java8.lamdaExpression;

//creating a functional interface to invoked lambda Expression
@FunctionalInterface
interface Show{
    void show();
}
public class LambdaMethodNoArgumetNoReturnType {
    public static void main(String[] args) {
        //writing a lambda method with no argument no return type
        Show object=()-> System.out.println("Show method called...");//output:Show method called...

        //calling show method
        object.show();
    }

}
