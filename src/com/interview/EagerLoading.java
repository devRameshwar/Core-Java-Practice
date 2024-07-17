package com.interview;

public class EagerLoading {

    public static final EagerLoading instance=new EagerLoading();

    public EagerLoading () {
        System.out.println("Object is created...");
    }

    public static EagerLoading getInstance(){

        System.out.println("Return the object.....");
        return instance;
    }

    public static void main(String[] args) {

       // System.out.println(getInstance());
        //System.out.println(getInstance());
        System.out.println(instance);
        System.out.println(instance);
    }

}
