package com.optionalClass;

import java.util.Optional;

public class Operation2 {

    public static Optional<String> operation() {
        String string = null;
        Optional<String> optional = null;
        if (string == null) {
            optional = Optional.empty();
        } else {
            optional = Optional.of(string);
        }
        return optional;
    }

    public static void main(String[] args) {
        Optional<String> operation = operation();
        operation.ifPresent(e -> {
            System.out.println(e.toUpperCase());
            System.out.println("Value is present....");
        });

       Optional<String> optional1= operation();
       optional1.ifPresentOrElse(e->{
           System.out.println(e.toUpperCase());
           System.out.println("value is present...");
       },()-> System.out.println("value is not present.....perform some Exception logic.."));

    }

}
