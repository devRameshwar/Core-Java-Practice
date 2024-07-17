package com.optionalClass;

import java.util.Optional;

public class Operation1 {

    public static Optional<String > operation(){
        String string=null;
        Optional<String > optional=null;
        if(string==null){
            optional=Optional.empty();
        }else {
            optional=Optional.of(string);
        }
        return optional;
    }

    public static void main(String[] args) {

        Optional<String> string = operation();
        if (string.isPresent()) {
            String s = string.get();
            System.out.println("is present: " + s);
        }
        //String stringUpperCase = string.get().toUpperCase();
        //System.out.println(stringUpperCase);

    }
}
