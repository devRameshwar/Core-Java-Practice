package com.generics;

public class BoundedTypeParameters {

    public static void main(String[] args) {
        Generics<Integer> number = new Generics<>(100);
        System.out.println("Integer"+number);

        Generics<Float> floatGenerics = new Generics<>(1010.11f);
        System.out.println("Floting Value: "+floatGenerics);

        //but here we getting compile time error because we define Bound type parameter
       // Generics<String> stringGenerics = new Generics<String>();

    }
}

class Generics<n extends Number>{
    n n;

    public Generics(n n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "n=" + n +
                '}';
    }
}
