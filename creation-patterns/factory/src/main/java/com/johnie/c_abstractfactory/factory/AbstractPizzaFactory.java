package com.johnie.c_abstractfactory.factory;

import com.johnie.c_abstractfactory.pizza.Pizza;

public interface AbstractPizzaFactory {
    Pizza createCheesePizza();
    Pizza createGreekPizza();
}
