package com.BuilderPattern.deom;

/**
 * created by lin.wang 2019/4/29
 */
public class BuilderDeomTest01 {
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();

        Meal meal = mb.buildMeal1();
        meal.shouItemsInfo();
        meal.getSumPrice();
        System.out.println();
        System.out.println(meal.getSumPrice());
        Meal meal1 = mb.buildMeal2();
        meal1.shouItemsInfo();
        meal1.getSumPrice();
        System.out.println();
        System.out.println(meal1.getSumPrice());
    }
}
