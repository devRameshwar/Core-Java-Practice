package com.objectClass;

import java.util.Objects;

public class HashCodeMethod_Person {

    private String personName;
    private int age;

    public HashCodeMethod_Person(String personName, int age) {
        this.personName = personName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HashCodeMethod_Person that = (HashCodeMethod_Person) o;
        return age == that.age && Objects.equals(personName, that.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, age);
    }


    public static void main(String[] args) {

        HashCodeMethod_Person person1 = new HashCodeMethod_Person("Sivi", 21);
        HashCodeMethod_Person person2 = new HashCodeMethod_Person("Rameshwar", 22);

        System.out.println(person1.equals(person1));

    }


}
