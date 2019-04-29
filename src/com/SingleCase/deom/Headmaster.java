package com.SingleCase.deom;

/**
 * created by lin.wang 2019/4/29
 */
public class Headmaster {

    private String name;

    private static Headmaster headmaster = new Headmaster();

    public Headmaster(){

    }

    public static Headmaster getInstance(){
        return headmaster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
