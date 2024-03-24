package Practice_core_java.src.com.java8.functionalInterface;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(5);
        //printing normal sorting order like Ascending order
        System.out.println(treeSet);
    }
}
