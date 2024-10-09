package com.johnie.c_abstractfactory.factory;

import com.johnie.c_abstractfactory.pizza.Pizza;
import com.johnie.c_abstractfactory.pizza.XiaMenCheesePizza;
import com.johnie.c_abstractfactory.pizza.XiaMenGreekPizza;

/**
 * @author JohnieCheng
 * @version 1.0
 * @date 2024/9/4 10:49
 */
public class XiaMenPizzaFactory implements AbstractPizzaFactory {
    @Override
    public Pizza createCheesePizza() {
        return new XiaMenCheesePizza();
    }

    @Override
    public Pizza createGreekPizza() {
        return new XiaMenGreekPizza();
    }
}
