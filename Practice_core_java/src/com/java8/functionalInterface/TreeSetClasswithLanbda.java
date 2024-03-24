package Practice_core_java.src.com.java8.functionalInterface;

import java.util.TreeSet;

public class TreeSetClasswithLanbda {

    public static void main(String[] args) {
        //customize soring order with lambda expression
        TreeSet<Integer> treeSet = new TreeSet<> ((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(5);
        //printing normal sorting order like
        //Descending order
        System.out.println(treeSet);
    }
}
