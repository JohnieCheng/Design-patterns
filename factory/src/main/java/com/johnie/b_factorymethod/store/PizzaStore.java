package com.johnie.b_factorymethod.store;

import com.johnie.b_factorymethod.factory.CheesePizzaFactory;
import com.johnie.b_factorymethod.factory.GreekPizzaFactory;
import com.johnie.b_factorymethod.factory.PizzaFactory;
import com.johnie.b_factorymethod.pizza.Pizza;

public class PizzaStore {
    public Pizza order(String pizzaName) {
        PizzaFactory pizzaFactory = new CheesePizzaFactory();
        if ("Cheese".equals(pizzaName)) {
            pizzaFactory = new CheesePizzaFactory();
        }
        if ("Greek".equals(pizzaName)) {
            pizzaFactory = new GreekPizzaFactory();
        }
        Pizza pizza = pizzaFactory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
