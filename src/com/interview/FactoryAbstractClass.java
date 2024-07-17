package com.interview;

public abstract class FactoryAbstractClass implements FactoryInterface{

    public abstract FactoryInterface factoryMethod();

    public void  anOperation(){
        FactoryInterface instance=factoryMethod();

        System.out.println("FactoryInterface object reference created...");

        instance.show();
    }
    
}
