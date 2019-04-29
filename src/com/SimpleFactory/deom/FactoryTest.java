package com.SimpleFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class FactoryTest {
    public static void main(String[] args) {
        FruitsFactory f = new FruitsFactory();
        Fruits fruits1 = f.getFruits("1");
        fruits1.mature();
        fruits1.sellOut();
        System.out.println("----------------------------------------");
        Fruits fruits2 = f.getFruits("2");
        fruits2.mature();
        fruits2.sellOut();
        System.out.println("----------------------------------------");
        Fruits fruits3 = f.getFruits("3");
        fruits3.mature();
        fruits3.sellOut();
        System.out.println("----------------------------------------");

    }
}
