package com.johnie.eager;

/**
 * 饿汉式（静态常量）
 */
public class EagerSingleton1 {
    //    2. 类的内部创建对象
    private static final EagerSingleton1 instance = new EagerSingleton1();

    //    1. 构造器私有化
    private EagerSingleton1() {
    }

    //    3. 向外暴露一个静态的公有方法 getInstance
    public static EagerSingleton1 getInstance() {
        return instance;
    }
}
