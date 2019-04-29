package com.BuilderPattern.deom.Item;

/**
 * created by lin.wang 2019/4/29
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public double price() {
        return 30;
    }
}
