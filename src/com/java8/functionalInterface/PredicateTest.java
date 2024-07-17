package Practice_core_java.src.com.java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {

    public static void employeeSallary() {
        //creating a predicate object for Employee class and write lambda expression test method
        Predicate<Employees> emp = e -> e.sallary > 100;
        System.out.println(emp.test(new Employees("raju", 100.1)));
    }

    public static void employeeName() {
        //we compare string value with equals method
        Predicate<Employees> emp = e -> e.employeeName.equals("raju");
        System.out.println(emp.test(new Employees("raju", 90.0)));
    }

    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> i > 10;
        System.out.println(predicate.test(5));
        employeeSallary();
        employeeName();
    }
}

class Employees {
    String employeeName;
    double sallary;

    public Employees(String employeeName, double sallary) {
        this.employeeName = employeeName;
        this.sallary = sallary;
    }
}
