package com.java8.functionalInterface;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

       /* Represents an operation that accepts a single input argument and returns no result.
                Unlike most other functional interfaces,
                Consumer is expected to operate via side-effects.*/

        Consumer consumer1 = (Consumer<String>) System.out::println;

        Consumer<String> consumer2 = (String s) -> {
            System.out.println(s);
            System.out.println(s.length());
            System.out.println(s.toUpperCase());
        };


       /* consumer2.accept("Hello Rameshwar Singh");
        consumer1.accept("Is a coder.");
*/
        //In Consumer interface there are one default method ----> andThen()

        //THIS IS CALLES CONSUMER CHAINING
        Consumer consumer = consumer2.andThen(consumer1);
        consumer.accept("welcome to Java Practice");
    }
}
