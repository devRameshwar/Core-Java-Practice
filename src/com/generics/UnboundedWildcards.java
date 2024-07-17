package com.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {

    public static void showList(List<?> list){
        System.out.println(list);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(101, 102, 103);
        showList(integerList);
        List<String> stringList = Arrays.asList("Rani", "Raja", "Kaju");

        showList(stringList);

    }
}
