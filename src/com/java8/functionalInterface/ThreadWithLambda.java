package com.java8.functionalInterface;

public class ThreadWithLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 9; i++) {
                System.out.println("child Thread running: " + i);
            }
        };
        Thread thread = new Thread(runnable);
        //if we call start method automatically run method called
        thread.start();
        for (int i = 0; i < 9; i++) {
            System.out.println("main Thread running: " + i);
        }
    }

}
