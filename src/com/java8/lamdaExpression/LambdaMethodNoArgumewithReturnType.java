package Practice_core_java.src.com.java8.lamdaExpression;
@FunctionalInterface
interface Show1{
    //by default in Interface all method are public abstract
   int show();
}
public class LambdaMethodNoArgumewithReturnType {
    public static void main(String[] args) {
        //creating a method with no arguments with return type
        //if only-one line of code in lambda expression then no need of {} curly breses
         Show1 obj=()->"Hello".length();

         //calling show method
        System.out.println("length of Hello is: "+obj.show());
    }
}
