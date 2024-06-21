package Practice_core_java.src.com.optionalClass;

import java.util.Optional;

public class Operation3 {

    public static Optional<String> operation() {
        String string = null;
        Optional<String> optional = null;
        if (string == null) {
            optional = Optional.empty();
        } else {
            optional = Optional.of(string);
        }
        return optional;
    }

    public static void main(String[] args) {

        Optional<String> operation = operation();

        //if value is present then return same value else return optional class value
        String string = operation.or(() -> Optional.of("Optional class object..")).get();
        System.out.println(string);


    }
}
