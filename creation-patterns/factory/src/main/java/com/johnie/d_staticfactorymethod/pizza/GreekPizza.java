package com.johnie.d_staticfactorymethod.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println(name + " preparing;");
    }
}
