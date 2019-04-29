package com.BuilderPattern.deom.drink;

/**
 * created by lin.wang 2019/4/29
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public double price() {
        return 6.8;
    }
}
