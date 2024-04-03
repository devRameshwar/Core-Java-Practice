package Practice_core_java.src.com.java8.function;

import java.util.function.Function;

public class FunctionalInterfaceTest2 {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = i -> i + i;
        Function<Integer, Integer> function2 = i -> i * i;
        System.out.println(function1.andThen(function2).apply(2));//16
        System.out.println(function1.compose(function2).apply(2));//8
    }
}
