package com.practice;

public class Employee {

    //class variable
    public static String complnyName;

    //Instance variable
    public int id;
    public String name;
    public float sallary;



    public static void main(String[] args) {
        //objet creation
        Employee ram = new Employee();
        Employee syam = new Employee();

        //initialization
        ram.id = 101;
        ram.name = "Ram";
        ram.sallary = 2000.0f;
        syam.id = 102;
        syam.name = "Syam";
        syam.sallary = 1000.0f;

        complnyName = "Wipro";
        System.out.println(ram.id + "\t" + ram.sallary + "\t" + ram.name + "\t" + complnyName);
        System.out.println(syam.id + "\t" + syam.sallary + "\t" + syam.name + "\t" + complnyName);

        //locale variable
        float totelSallary = ram.sallary + syam.sallary;

        System.out.println("Total salary: "+totelSallary);


    }

}
