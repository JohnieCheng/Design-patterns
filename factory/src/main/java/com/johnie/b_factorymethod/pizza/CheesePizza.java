package com.johnie.b_factorymethod.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("奶酪pizza");
        System.out.println(name + " preparing;");
    }
}
