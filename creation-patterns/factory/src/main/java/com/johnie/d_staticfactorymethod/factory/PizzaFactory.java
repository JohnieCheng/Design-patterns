package com.johnie.d_staticfactorymethod.factory;

import com.johnie.d_staticfactorymethod.pizza.CheesePizza;
import com.johnie.d_staticfactorymethod.pizza.GreekPizza;
import com.johnie.d_staticfactorymethod.pizza.Pizza;

/**
 * @author JohnieCheng
 * @version 1.0
 * @date 2024/9/4 10:49
 */
public class PizzaFactory {
    public static Pizza createPizza(String pizzaName) {
        if ("Cheese".equals(pizzaName)) {
            return new CheesePizza();
        }
        if ("Greek".equals(pizzaName)) {
            return new GreekPizza();
        }
        return new CheesePizza();
    }
}
