package com.generics;

public class GenericsClass {

    public static void main(String[] args) {
        GenericsMain<String> object = new GenericsMain<>("Hello");
        System.out.println(object);

        GenericsMain<Integer> number = new GenericsMain<>(100);
        System.out.println(number);
    }
}

class  GenericsMain<T>{

    T t;

    public GenericsMain(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "GenericsMain{" +
                "t=" + t +
                '}';
    }
}
