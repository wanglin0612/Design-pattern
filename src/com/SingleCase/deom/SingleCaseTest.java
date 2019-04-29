package com.SingleCase.deom;

/**
 * created by lin.wang 2019/4/29
 */
public class SingleCaseTest {

    public static void main(String[] args) {
        Headmaster instance = Headmaster.getInstance();
        Headmaster instance2 = Headmaster.getInstance();

        instance.setName("hahh 111");
        System.out.println("instance2 : "+instance2.getName());
        instance2.setName("hahh 122");
        System.out.println("instance1 : "+instance.getName());

        System.out.println(instance == instance2);

    }
}
