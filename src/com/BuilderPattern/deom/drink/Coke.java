package com.BuilderPattern.deom.drink;

/**
 * created by lin.wang 2019/4/29
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public double price() {
        return 18.67;
    }
}
