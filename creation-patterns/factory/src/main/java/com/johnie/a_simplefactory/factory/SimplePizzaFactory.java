package com.johnie.a_simplefactory.factory;

import com.johnie.a_simplefactory.pizza.CheesePizza;
import com.johnie.a_simplefactory.pizza.GreekPizza;
import com.johnie.a_simplefactory.pizza.Pizza;

public class SimplePizzaFactory {
    private SimplePizzaFactory() {
    }

    public static Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new CheesePizza();
        }
//        if (type.equals("Pepper")) {
//            return new Pepper();
//        }
//        ...
        return new GreekPizza();
    }


}
