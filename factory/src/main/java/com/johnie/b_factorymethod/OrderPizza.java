package com.johnie.b_factorymethod;

import com.johnie.b_factorymethod.pizza.Pizza;
import com.johnie.b_factorymethod.store.PizzaStore;

/**
 * 简单工厂模式 启动类
 */
public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza cheese = pizzaStore.order("Cheese");
        System.out.println(cheese.getName() + "：做好了");
    }
}
