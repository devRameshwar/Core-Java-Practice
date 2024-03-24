package Practice_core_java.src.com.java8.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompraterSorting2 implements Comparator<Integer> {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        //printing without sorting order
        System.out.println("without sorting: "+list);
        Collections.sort(list,new CompraterSorting2());
        System.out.println("sorted in ascending order: "+list);

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1<o2)?1:(o1>o2)?-1:0;
    }
}
