package com.AbstractFactory.deom;

import com.sun.scenario.effect.impl.hw.ShaderSource;

/**
 * created by lin.wang 2019/4/28
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is triangle");
    }
}
