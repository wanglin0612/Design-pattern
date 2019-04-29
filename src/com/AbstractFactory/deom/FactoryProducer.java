package com.AbstractFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class FactoryProducer {

    public static AbstractFactory getAbstractFactory(String type){
        switch (type){
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
        }
        return null;

    }
}
