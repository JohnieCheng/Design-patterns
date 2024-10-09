package com.johnie.a_simplefactory.store;

import com.johnie.a_simplefactory.factory.SimplePizzaFactory;
import com.johnie.a_simplefactory.pizza.Pizza;

public class PizzaStore {
    public Pizza order(String pizzaName) {
        Pizza pizza = SimplePizzaFactory.createPizza(pizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
