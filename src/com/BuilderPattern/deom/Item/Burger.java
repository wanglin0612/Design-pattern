package com.BuilderPattern.deom.Item;

/**
 * created by lin.wang 2019/4/29
 */
public abstract  class Burger implements Item{

    @Override
    public abstract String name();

    @Override
    public abstract double price();


    public Packing packing(){

        return new Wrapper();
    }
}
