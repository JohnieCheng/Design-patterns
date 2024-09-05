package com.johnie.a_simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println(name + " preparing;");
    }
}
