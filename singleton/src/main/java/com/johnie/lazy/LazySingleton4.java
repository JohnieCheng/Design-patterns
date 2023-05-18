package com.johnie.lazy;

/**
 * 懒汉式（线程安全，双重检查）
 * 优点：Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。
 *      实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象，也避免的反复进行方法同步。
 *      线程安全；延迟加载；效率较高。
 * 推荐使用
 */
public class LazySingleton4 {
    private static volatile LazySingleton4 lazySingleton4;

    private LazySingleton4() {
    }

    public static LazySingleton4 getInstance() {
        if (lazySingleton4 == null) {
            synchronized (LazySingleton4.class) {
                if (lazySingleton4 == null){
                    lazySingleton4 = new LazySingleton4();
                }
            }
        }
        return lazySingleton4;
    }
}
