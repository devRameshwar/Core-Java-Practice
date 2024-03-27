package Practice_core_java.src.com.java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullOrEmptyValue {
    public static void main(String[] args) {
        String[] strings = {"", null, "sivi", null, "rani", "", "sima"};
        /*write a predicate to removed null or empty value*/
        Predicate<String> removeNullorEmpty = s -> s != null && s.length() != 0;
        /*define a ArrayList for store filter value*/
        List<String> list = new ArrayList<>();
        for (String s : strings) {
            if (removeNullorEmpty.test(s)) {

                list.add(s);
            }
        }
        System.out.println(list);
    }
}
