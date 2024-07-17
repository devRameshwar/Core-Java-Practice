package com.java8.ananymousClass;

public class ThreadAnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("child Thread is running..."+i);
            }
            /*Note: Here an Anonymous class is created and its object is assign in Thread class  */
        });
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread class is running.."+i);
        }
    }
}
