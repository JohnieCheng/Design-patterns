package com.johnie.lazy;

/**
 * 懒汉式（线程安全，同步代码块）
 * 优点：这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的的代码块。
 * 缺点：这种同步并不能起到线程同步的作用.
 *      假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 不推荐使用
 */
public class LazySingleton3 {
    private static LazySingleton3 lazySingleton3;

    private LazySingleton3() {
    }

    public static LazySingleton3 getInstance() {
        if (lazySingleton3 == null) {
            synchronized (LazySingleton3.class) {
                lazySingleton3 = new LazySingleton3();
            }
        }
        return lazySingleton3;
    }
}
