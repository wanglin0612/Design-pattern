package com.BuilderPattern.deom.Item;

/**
 * created by lin.wang 2019/4/29
 * 纸包装
 */
public class Wrapper implements Packing {
    @Override
    public String packing() {
        return "wrapper";
    }
}
