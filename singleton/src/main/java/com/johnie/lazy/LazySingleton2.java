package com.johnie.lazy;

/**
 * 懒汉式（线程安全，同步方法）
 * 优点：解决了线程安全的问题
 * 缺点：效率太低，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就好。
 * 不推荐使用
 */
public class LazySingleton2 {
    private static LazySingleton2 lazySingleton2;

    private LazySingleton2() {
    }

    public static synchronized LazySingleton2 getInstance() {
        if (lazySingleton2 == null) {
            lazySingleton2 = new LazySingleton2();
        }
        return lazySingleton2;
    }
}
