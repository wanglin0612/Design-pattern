package com.BuilderPattern.deom.drink;

import com.BuilderPattern.deom.Item.Item;
import com.BuilderPattern.deom.Item.Packing;

/**
 * created by lin.wang 2019/4/29
 */
public abstract class ColdDrink implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
