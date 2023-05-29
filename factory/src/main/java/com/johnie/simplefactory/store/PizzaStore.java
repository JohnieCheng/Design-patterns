package com.johnie.simplefactory.store;

import com.johnie.simplefactory.factory.SimplePizzaFactory;
import com.johnie.simplefactory.pizza.CheesePizza;
import com.johnie.simplefactory.pizza.GreekPizza;
import com.johnie.simplefactory.pizza.Pizza;

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
