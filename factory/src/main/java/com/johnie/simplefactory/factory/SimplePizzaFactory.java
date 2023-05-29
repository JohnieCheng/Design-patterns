package com.johnie.simplefactory.factory;

import com.johnie.simplefactory.pizza.CheesePizza;
import com.johnie.simplefactory.pizza.GreekPizza;
import com.johnie.simplefactory.pizza.Pizza;

public class SimplePizzaFactory {
    private SimplePizzaFactory() {
    }

    public static Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new CheesePizza();
        }
        return new GreekPizza();
    }


}
