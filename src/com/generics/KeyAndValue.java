package com.generics;

import java.util.Arrays;
import java.util.List;

public class KeyAndValue {

    public static void main(String[] args) {

        KeyValueClass object = new KeyValueClass ();
        object.setK(101);
        object.setV("Welcome Rameshwar singh");

        List<String> list = Arrays.asList("Syam", "Ram", "Radha");

        object.setV(list);

        System.out.println(object.getV());

        System.out.println("Key: "+object.getK()+"\t"+"Value: "+object.getV());


    }
}
class KeyValueClass<k,v>{
    k k;
    v v;

    public void setK(k k) {
        this.k = k;
    }

    public void setV(v v) {
        this.v = v;
    }

    public k getK() {
        return k;
    }

    public v getV() {
        return v;
    }
}