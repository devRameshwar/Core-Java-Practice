package com.java8.ananymousClass;

@FunctionalInterface
interface Test {
    void show();
}

public class AnonymousInnerClassVsLambdaEx {
    int a = 10;//instance variable of current class

    public static void main(String[] args) {
        AnonymousInnerClassVsLambdaEx ex = new AnonymousInnerClassVsLambdaEx();
        ex.print();
        ex.print1();
    }

    //this method represents Anonymous class only
    public void print() {
        Test test = new Test() {
            final int a = 20;//instance variable of Anonymous class

            @Override
            public void show() {
                System.out.println(this.a);//this is a print current Anonymous class object a value 20
            }
        };
        test.show();
    }

    //this method represents lambda expression class only
    public void print1() {
        Test test = () -> {
            int a = 30;//this is a local variable for lambda function method only
            System.out.println(this.a);//this print current class object only 10
        };
        //printing show method by lambda instance
        test.show();
    }

}
