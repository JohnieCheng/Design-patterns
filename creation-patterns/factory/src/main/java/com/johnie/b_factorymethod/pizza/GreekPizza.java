package com.johnie.b_factorymethod.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println(name + " preparing;");
    }
}
