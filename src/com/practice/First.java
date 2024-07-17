package com.practice;

public class First {


    //instance variable
    public int a;

   public float c;

    //class/static variable
    public static int b=20;

    //methods
    public void show(){
        System.out.println("show() method");
    }

    //method
    public void print(){
        int d=10;
        System.out.println("print() method");
    }
    //block
    {
        System.out.println("block");
    }

    //static block
    static {
        System.out.println("static block");
    }


    //constructor
    public First(){
        System.out.println("Constructor");
    }

    //main method
    public static void main(String[] args) {

        //object creation
        First first = new First();
        //local variable
        int a=30;
        //local variable
        int c;

        System.out.println("a= "+first.a);
        System.out.println("c= "+first.c);


        System.out.println("a= "+a);
        /*first.print();*/
        //System.out.println(First.b);

    }

}
