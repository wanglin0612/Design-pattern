package com.AbstractFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
