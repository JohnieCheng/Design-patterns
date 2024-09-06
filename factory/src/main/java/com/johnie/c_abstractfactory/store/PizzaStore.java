package com.johnie.c_abstractfactory.store;

import com.johnie.c_abstractfactory.pizza.Pizza;

/**
 *
 * @author JohnieCheng
 * @version 1.0
 * @date 2024/9/6 15:01
 */
public interface PizzaStore {
    Pizza order(String pizzaName);
}
