package com.SimpleFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class Orange implements Fruits{
    @Override
    public void mature() {
        System.out.println("orange is mature");
    }

    @Override
    public void sellOut() {
        System.out.println("orange is sell out");
    }
}
