package com.AbstractFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color){
            case "1":
                return new Red();
            case "2":
                return new Green();
            case "3":
                return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
