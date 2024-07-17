package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCity {

    //soring city list as a descending order with respect to length of city name
    public static void sortingCity(){
        List<String> cityList = Arrays.asList("Varanasi", "Delhi", "Hyderabad", "Bangalore");

        cityList.sort(Comparator.comparingInt(String::length).reversed());

        List<String> sortedCity = cityList.stream().sorted(Comparator.comparingInt(c -> c.toString().length()) .reversed()).collect(Collectors.toList());
        System.out.println(sortedCity);
        System.out.println(cityList);
    }


    public static void main(String[] args) {

        sortingCity();

    }
}
