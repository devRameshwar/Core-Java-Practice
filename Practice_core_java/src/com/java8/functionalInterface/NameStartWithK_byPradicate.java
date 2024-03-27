package Practice_core_java.src.com.java8.functionalInterface;

import java.util.function.Predicate;

public class NameStartWithK_byPradicate {
    public static void main(String[] args) {

        String[] names = {"Anita", "Kajal", "kaitrina", "Karina", "Nidhi", "smriti"};
        /*Define a pradicate to filter names start with 'k'*/
        Predicate<String> startwith = s -> s.startsWith("k") || s.startsWith("K");

        for (String s : names) {
            if (startwith.test(s)) {
                System.out.println(s);
            }
        }
    }
}
