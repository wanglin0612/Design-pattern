package com.BuilderPattern.deom.drink;

import com.BuilderPattern.deom.Item.Packing;

/**
 * created by lin.wang 2019/4/29
 * 瓶包装
 */
public class Bottle implements Packing {
    @Override
    public String packing() {
        return "bottle";
    }
}
