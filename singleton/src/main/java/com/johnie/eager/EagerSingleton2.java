package com.johnie.eager;

/**
 * 饿汉式（静态代码块）和静态常量优缺点一样
 */
public class EagerSingleton2 {
    private EagerSingleton2() {
    }

    private static EagerSingleton2 eagerSingleton2;

    //    在静态代码块执行时创建单例对象
    static {
        eagerSingleton2 = new EagerSingleton2();
    }

    public static EagerSingleton2 getInstance() {
        return eagerSingleton2;
    }
}
