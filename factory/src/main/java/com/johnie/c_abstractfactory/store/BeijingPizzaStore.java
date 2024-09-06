package com.johnie.c_abstractfactory.store;

import com.johnie.c_abstractfactory.factory.AbstractPizzaFactory;
import com.johnie.c_abstractfactory.factory.BeijingPizzaFactory;
import com.johnie.c_abstractfactory.pizza.Pizza;

public class BeijingPizzaStore implements PizzaStore {
    public Pizza order(String pizzaName) {
        AbstractPizzaFactory pizzaFactory = new BeijingPizzaFactory();
        if ("Cheese".equals(pizzaName)) {
            pizzaFactory.createCheesePizza();
        }
        if ("Greek".equals(pizzaName)) {
            pizzaFactory.createGreekPizza();
        }
        Pizza pizza = pizzaFactory.createCheesePizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
