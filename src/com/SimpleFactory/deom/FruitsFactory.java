package com.SimpleFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class FruitsFactory {

    public Fruits getFruits(String type){
        switch (type){
            case "1":
                return new Apple();
            case "2":
                return new Banner();
            case "3":
                return new Orange();
        }
        return null;
    }
}
