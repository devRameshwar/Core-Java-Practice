package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class ImmutableClass {

    private final String object;

    public ImmutableClass(String object) {
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "object='" + object + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ImmutableClass object = new ImmutableClass("Hello");

        System.out.println(object);

        //Sorting a String list respect to length
        List<String> stringList = Arrays.asList("Aman", "Rajan", "Akhilesh", "Siv");

        List<String> sortedString = stringList.stream().
                sorted(Comparator.comparingInt(e -> e.toString()
                        .length()).reversed()).collect(Collectors.toList());
        System.out.println(sortedString);

        List<String> stringList1 = stringList.stream().sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
        System.out.println(stringList1);

    }

}
