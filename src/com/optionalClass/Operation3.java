package com.optionalClass;

import java.util.Optional;

public class Operation3 {

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

        //if value is present then return same value else return optional class value
        String string = operation.or(() -> Optional.of("Optional class object..")).get();
        System.out.println(string);

        Optional<String> operation1 = operation();

        //orElse()method return same value if value is present otherwise it return given value
        String orElse = operation1.orElse("Other value...");
        System.out.println(orElse);

        //orElseGet(Supplier  functionality)
        //if value is present then return same otherwise it return Supplier logic
        Optional<String> operation2 = operation();
        String orElseGet = operation2.orElseGet(() -> {
            return "Supplier functionality logic return ";
        });
        System.out.println(orElseGet);


    }
}
