package Practice_core_java.src.com.java8.staticMethod;
interface Tata{
    public static void show(){
        System.out.println("Tata show method called...");
    }
}
public class StaticCar implements Tata{

    //Note: it cannot be Override it is called overridden show method (it is a class level static method)
    public static void show(){
        System.out.println("child show method called...");
    }

    public static void main(String[] args) {
        Tata tata=new StaticCar();
        //we are unable to call show method to help of interface object reference we cannot access
        //tata.show();
        //then we called with help of class name
        StaticCar.show();
        Tata.show();
    }
}
