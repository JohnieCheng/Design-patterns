package com.johnie.b_factorymethod.factory;

import com.johnie.b_factorymethod.pizza.CheesePizza;
import com.johnie.b_factorymethod.pizza.Pizza;

/**
 * @author JohnieCheng
 * @version 1.0
 * @date 2024/9/4 10:49
 */
public class CheesePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
