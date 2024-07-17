package com.interview;

public class LazyLoading {

    private static LazyLoading instance;

    public LazyLoading() {

        System.out.println("Object is created...");
    }

    public static LazyLoading getLazyLoading() {
        if (instance == null) {
            instance = new LazyLoading();
        }

        System.out.println("Return the object....");
        return instance;
    }

    public static void main(String[] args) {

        System.out.println(getLazyLoading());

        System.out.println(getLazyLoading());
    }
}
