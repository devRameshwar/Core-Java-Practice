package Practice_core_java.src.com.optionalClass;

import java.util.Optional;

public class Operation2 {

    public static void main(String[] args) {
        operation1();
        //operation2();
    }

    public static void operation1(){
        String string=null;
        Optional<String > optionalString=Optional.of(string);

        optionalString.ifPresent(e-> {
            System.out.println(e.toUpperCase());
            System.out.println("Write any number of logic it consumer does not return any value...");
        });
    }
    public static void operation2(){
        String string=null;
        Optional<String > optionalString=Optional.of(string);

        optionalString.ifPresentOrElse(e->{
            System.out.println(e.toUpperCase());
            System.out.println("value is present....");
        },()-> System.out.println("handle the run time Exception...."));
    }
}
