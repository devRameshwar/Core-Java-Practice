package com.java8.defaultMethod;
interface Maruti{
    default void show(){
        System.out.println("MARUTI METHOD is called....");
    }
}
interface  Tata{
    default void show(){
        System.out.println("TATA METHOD is called....");
    }
}
public class Car implements Tata,Maruti {
    //Note if we not override then we got Compile time error
    /*for this situation must be overridden the default method the method access modifier is public  */

    public void show(){
        System.out.println("CAR METHOD is called....");
        /*if we want to call TATA implemented method then*/
        Tata.super.show();
        /*if we want to call Maruti implemented method then*/
       // Maruti.super.show();
        //by default current class method is called
    }
    public static void main(String[] args) {
        Tata tata=new Car();
        tata.show();
    }
}
