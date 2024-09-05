package com.johnie;

import com.johnie.eager.EagerSingleton1;
import com.johnie.eager.EagerSingleton2;
import com.johnie.enums.Singleton;

/**
 * Hello world!
 */
public class SingletonApp {

    public static void main(String[] args) {
        // 静态常量
        EagerSingleton1 instance1 = EagerSingleton1.getInstance();
        int hashCode1 = instance1.hashCode();
        EagerSingleton1 instance2 = EagerSingleton1.getInstance();
        int hashCode2 = instance2.hashCode();
        System.out.println(hashCode1 == hashCode2);

        // 静态代码块
        EagerSingleton2 instance3 = EagerSingleton2.getInstance();
        int hashCode3 = instance3.hashCode();
        EagerSingleton2 instance4 = EagerSingleton2.getInstance();
        int hashCode4 = instance4.hashCode();
        System.out.println(hashCode3 == hashCode4);

        // 枚举
        Singleton instance5 = Singleton.SingletonEnum.INSTANCE.getInstance();
        int hashCode5 = instance5.hashCode();
        Singleton instance6 = Singleton.SingletonEnum.INSTANCE.getInstance();
        int hashCode6 = instance6.hashCode();
        System.out.println(hashCode5 == hashCode6);


    }

}
