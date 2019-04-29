package com.BuilderPattern.deom;

import com.BuilderPattern.deom.Item.ChickenBurger;
import com.BuilderPattern.deom.Item.VegBurger;
import com.BuilderPattern.deom.drink.Coke;
import com.BuilderPattern.deom.drink.Pepsi;

/**
 * created by lin.wang 2019/4/29
 */
public class MealBuilder {

    public  Meal buildMeal1(){
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());

        return m;
    }
    public  Meal buildMeal2(){
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Pepsi());
        return m;
    }
}
