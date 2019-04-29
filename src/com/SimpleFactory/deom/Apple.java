package com.SimpleFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class Apple implements Fruits {
    @Override
    public void mature() {
        System.out.println("apple is mature");
    }

    @Override
    public void sellOut() {
        System.out.println("apple is sell out");
    }
}
