package com.johnie.enums;

/**
 * 优点：借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 这种方式是Effective Java作者Josh Bloch提倡的方式。
 * 单元素的枚举类型已经成为实现Singleton的最佳方法。
 * 推荐使用
 */
public class Singleton {

    private Singleton() {
    }

    public enum SingletonEnum {
        INSTANCE;
        private Singleton instance = null;

        private SingletonEnum() {
            instance = new Singleton();
        }

        public Singleton getInstance() {
            return instance;
        }
    }
}
