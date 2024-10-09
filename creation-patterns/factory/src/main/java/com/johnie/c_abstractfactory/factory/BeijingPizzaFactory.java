package com.johnie.c_abstractfactory.factory;

import com.johnie.c_abstractfactory.pizza.BeijingCheesePizza;
import com.johnie.c_abstractfactory.pizza.BeijingGreekPizza;
import com.johnie.c_abstractfactory.pizza.Pizza;

/**
 * @author JohnieCheng
 * @version 1.0
 * @date 2024/9/4 10:49
 */
public class BeijingPizzaFactory implements AbstractPizzaFactory {
    @Override
    public Pizza createCheesePizza() {
        return new BeijingCheesePizza();
    }

    @Override
    public Pizza createGreekPizza() {
        return new BeijingGreekPizza();
    }
}
