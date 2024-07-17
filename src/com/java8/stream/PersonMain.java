package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<Person>();
        //Adding people in ArrayList
        people.add(new Person("A", 'M', 32));
        people.add(new Person("B", 'M', 32));
        people.add(new Person("C", 'M', 32));
        people.add(new Person("D", 'F', 30));
        people.add(new Person("E", 'F', 28));
        people.add(new Person("F", 'M', 28));

        Map<Character, Double> genderAvgAgeMap = people.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.averagingInt(Person::getAge)));

        System.out.println(genderAvgAgeMap);//OutPut: {F=29.0, M=31.0}

        //collecting gender above 30
        List<Character> genderAbove30 = genderAvgAgeMap.entrySet()
                .stream().filter(enyry -> enyry.getValue() >= 30)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Gender Above 30: " + genderAbove30);//output: Gender Above 30: [M]
    }
}

class Person {

    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
