package com.johnie.d_staticfactorymethod.store;

import com.johnie.d_staticfactorymethod.factory.PizzaFactory;
import com.johnie.d_staticfactorymethod.pizza.Pizza;

public class PizzaStore {
    public Pizza order(String pizzaName) {
        Pizza pizza = PizzaFactory.createPizza(pizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
