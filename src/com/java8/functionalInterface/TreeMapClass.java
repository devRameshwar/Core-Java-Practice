package com.java8.functionalInterface;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100,"Anuj");
        treeMap.put(300, "Raju");
        treeMap.put(500, "Sreekanth");
        treeMap.put(400, "Birju");
        treeMap.put(600, "Bunny");
        //the default nature of sorting order is Acceding with respect of a key
        System.out.println(treeMap);
    }
}
