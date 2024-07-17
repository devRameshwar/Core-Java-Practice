package com.interview;

public class FactoryDesign extends FactoryAbstractClass {

    @Override
    public FactoryInterface factoryMethod() {

        FactoryDesign factoryDesign = new FactoryDesign();
        System.out.println("Abstract method concrete method called..");

        return factoryDesign;
    }

    @Override
    public void show() {
        System.out.println("FactoryDesign is show method called....");
    }

    public static void main(String[] args) {
        new FactoryDesign().factoryMethod();
    }

}


interface FactoryInterface {
    void show();
}
