package com.AbstractFactory.deom;

/**
 * created by lin.wang 2019/4/28
 */
public class AbstracFactoryTest {

    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getAbstractFactory("shape");

        AbstractFactory color = FactoryProducer.getAbstractFactory("color");

        //正
        Shape shape1 = shape.getShape("1");
        shape1.draw();
        //长
        Shape shape2 = shape.getShape("2");
        shape2.draw();
        //三
        Shape shape3 = shape.getShape("3");
        shape3.draw();


        Color color1 = color.getColor("1");
        color1.fill();

        Color color2 = color.getColor("2");
        color2.fill();

        Color color3 = color.getColor("3");
        color3.fill();


    }




}
