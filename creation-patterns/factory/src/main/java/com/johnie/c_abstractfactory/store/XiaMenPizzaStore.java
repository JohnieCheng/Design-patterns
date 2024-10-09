package com.johnie.c_abstractfactory.store;

import com.johnie.c_abstractfactory.factory.AbstractPizzaFactory;
import com.johnie.c_abstractfactory.factory.XiaMenPizzaFactory;
import com.johnie.c_abstractfactory.pizza.Pizza;

public class XiaMenPizzaStore implements PizzaStore {
    public Pizza order(String pizzaName) {
        AbstractPizzaFactory pizzaFactory = new XiaMenPizzaFactory();
        if ("Cheese".equals(pizzaName)) {
            pizzaFactory.createCheesePizza();
        }
        if ("Greek".equals(pizzaName)) {
            pizzaFactory.createCheesePizza();
        }
        Pizza pizza = pizzaFactory.createCheesePizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
