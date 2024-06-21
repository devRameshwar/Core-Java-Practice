package Practice_core_java.src.com.optionalClass;

import java.util.Optional;

public class Operation {

    public static Optional<String> getUpperLatter() {
        String string1 = "ASDasd";
        Optional<String> string2 = Optional.of(string1);
        if (string1 == null) {
            System.out.println(string2.isEmpty());
        } else {
            System.out.println("String is not empty..");
        }
        return string2;
    }

    public static void main(String[] args) {

        Optional<String> string = getUpperLatter();
        if (string.isPresent()) {
            String s = string.get();
            System.out.println("is present" + s);
        }
        //String stringUpperCase = string.get().toUpperCase();
        //System.out.println(stringUpperCase);

    }
}
