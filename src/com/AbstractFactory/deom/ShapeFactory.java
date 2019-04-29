package com.AbstractFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape){
            case "1":
                return new Square();
            case "2":
                return new Rectangle();
            case "3":
                return new Triangle();
        }
        return null;
    }
}
