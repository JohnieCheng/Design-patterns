package com.johnie.c_abstractfactory;

import com.johnie.c_abstractfactory.pizza.Pizza;
import com.johnie.c_abstractfactory.store.BeijingPizzaStore;
import com.johnie.c_abstractfactory.store.PizzaStore;
import com.johnie.c_abstractfactory.store.XiaMenPizzaStore;

/**
 * 简单工厂模式 启动类
 */
public class OrderPizza {
    public static void main(String[] args) {

        PizzaStore beijingPizzaStore = new BeijingPizzaStore();
        Pizza beijingCheesePizza = beijingPizzaStore.order("Cheese");
        System.out.println(beijingCheesePizza.getName() + "：做好了");

        PizzaStore xiaMenPizzaStore = new XiaMenPizzaStore();
        Pizza xiaMenCheesePizza = xiaMenPizzaStore.order("Cheese");
        System.out.println(xiaMenCheesePizza.getName() + "：做好了");

    }
}
