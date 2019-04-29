package com.SimpleFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class Banner implements Fruits {
    @Override
    public void mature() {
        System.out.println("banner is mature");
    }

    @Override
    public void sellOut() {
        System.out.println("banner is sell out");
    }
}
