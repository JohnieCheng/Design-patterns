package com.johnie.a_simplefactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("奶酪pizza");
        System.out.println(name + " preparing;");
    }
}
