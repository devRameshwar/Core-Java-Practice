package com.java8.functionalInterface;

import java.util.TreeMap;

public class TreeMapWithLambda {
    public static void main(String[] args) {
        //I want to customise sorting order of treeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>((k1,k2)->(k1<k2)?1:(k1>k2)?-1:0);
        treeMap.put(100,"Anuj");
        treeMap.put(300, "Raju");
        treeMap.put(500, "Sreekanth");
        treeMap.put(400, "Birju");
        treeMap.put(600, "Bunny");
        // sorting order is descending with respect of a key
        System.out.println(treeMap);
        //Output: {600=Bunny, 500=Sreekanth, 400=Birju, 300=Raju, 100=Anuj}
    }
}
