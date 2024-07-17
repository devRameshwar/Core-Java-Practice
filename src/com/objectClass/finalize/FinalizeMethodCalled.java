package com.objectClass.finalize;

public class FinalizeMethodCalled {
    int a;
    @Override
    public void finalize(){
        System.out.println("finalize() is called....");

    }
    public void show(){
        System.out.println("show method called....");
    }
    public static void main(String[] args) {
        //Creating an object
        FinalizeMethodCalled object = new FinalizeMethodCalled();//birth an object
        //initialize class object a
        object.a=10;//life started an object
        System.out.println("value of a: "+object.a);

        //calling show method
        object.show();

        //end life an object
        object=null; //initializing null value of an object without this gc() method can't called

        //calling finalize() method with help of System.gc();
        System.gc(); //manual calling finalize() method
    }
}
//output:
/*value of a: 10
show method called....
finalize() is called....*/
