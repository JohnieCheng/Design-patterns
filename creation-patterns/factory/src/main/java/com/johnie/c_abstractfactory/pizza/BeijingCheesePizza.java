package com.johnie.c_abstractfactory.pizza;

public class BeijingCheesePizza implements Pizza {
    private String name = "Beijing Cheese Pizza";

    @Override
    public void prepare() {
        System.out.println(name + " preparing;");
    }

    @Override
    public void bake() {
        System.out.println(name + " baking;");
    }

    @Override
    public void cut() {
        System.out.println(name + " cutting;");
    }

    @Override
    public void box() {
        System.out.println(name + " boxing;");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
