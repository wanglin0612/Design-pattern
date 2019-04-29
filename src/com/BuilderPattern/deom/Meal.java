package com.BuilderPattern.deom;

import com.BuilderPattern.deom.Item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * created by lin.wang 2019/4/29
 */
public class Meal {

    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }

    public double getSumPrice(){
        double sum = 0;
        for (Item item: list) {
            sum+=item.price();
        }
        return sum;
    }

    public void shouItemsInfo(){
        for (Item item: list) {
            System.out.print("name : "+item.name()+"--");
            System.out.print("packing : "+item.packing().packing()+"--");
            System.out.print("price : "+item.price());
        }
    }
}
