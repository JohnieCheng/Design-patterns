package com.johnie.lazy;

/**
 * 懒汉式（线程不安全）
 * 优点：起到了Lazy Loading的效果，但是只能在单线程下使用。
 * 缺点：如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 *      所以在多线程环境下不可使用这种方式。
 * 不推荐使用
 */
public class LazySingleton1 {
    private static LazySingleton1 lazySingleton1;

    private LazySingleton1() {
    }

    public static LazySingleton1 getInstance() {
        if (lazySingleton1 == null) {
            lazySingleton1 = new LazySingleton1();
        }
        return lazySingleton1;
    }
}
