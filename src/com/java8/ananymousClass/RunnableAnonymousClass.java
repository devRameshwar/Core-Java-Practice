package com.java8.ananymousClass;

public class RunnableAnonymousClass {
    public static void main(String[] args) {
        //Note: if there is an anonymous class then it is a chance to replace with lambda expression
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 9; i++) {
                    System.out.println("inner class is running.."+i);
                }
            }
            /*Note: here an anonymous class is created, and it is implemented with Runnable interface
              and its object is assign in Runnable interface reference. */
        };
        Thread thread = new Thread(run);
        thread.start();
        for (int i = 0; i < 9; i++) {
            System.out.println("outer main class is running.."+i);
        }
    }
}
