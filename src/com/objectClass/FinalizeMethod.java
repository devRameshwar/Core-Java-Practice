package com.objectClass;

public class FinalizeMethod {

    public static void main(String[] args) {

        //creating an object of person class
        Person person=new Person(101,"Sivi singh");

        // Making the object eligible for garbage collection
        person=null;

        // Requesting JVM to run Garbage Collector
        System.gc();

        // Pausing the program to give GC time to run finalize
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Person{
    private Integer personId;
    private String personName;

    public Person(Integer personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    @Override
    protected void finalize() throws Throwable{
        try {
            System.out.println("Person details: "+ this.personId+"\t");
        }finally {
            System.out.println("Finally method called....");
            this.finalize();
        }
    }
}
