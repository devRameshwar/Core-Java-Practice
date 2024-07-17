package com.java8.lamdaExpression;

@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

public class LambdaMethodWithArgumetWithReturnType {
    public static void main(String[] args) {
        //creating a functional interface  to with arguments and with return type
        Addition obj = (a, b) -> a + b;

        //Here more than one line of code that why we will use {} curly bracket
        Addition obj1=(a,b)->{
            System.out.println("add method is called....");
            return a+b;
        };
        //calling add method
        System.out.println(obj.add(100, 200));

        //calling with obj1 object method show
        System.out.println(obj1.add(50,100));
    }

}
