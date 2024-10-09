package com.johnie.lazy;

/**
 * 懒汉式（线程安全，静态内部类）
 * 优点：这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * 静态内部类方式在Singleton类被装载时并不会立即实例化，
 * 而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 避免了线程不安全，利用静态内部类特点实现延迟加载，效率高。
 * 推荐使用
 */
public class LazySingleton5 {

    private LazySingleton5() {
    }

    public static LazySingleton5 getInstance() {
        return SingletonInstance.LAZY_SINGLETON;
    }

    private static class SingletonInstance {
        private static final LazySingleton5 LAZY_SINGLETON = new LazySingleton5();
    }
}
