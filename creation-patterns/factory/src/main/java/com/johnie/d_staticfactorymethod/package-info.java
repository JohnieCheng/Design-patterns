/**
 * 静态工厂模式
 * 静态工厂方法是一种简单工厂的变体。
 * 工厂方法使用 static 修饰，客户端直接通过类名调用静态方法来创建对象，而不需要实例化工厂类。
 * 优点：简化了工厂类的使用方式，客户端直接调用静态方法获取实例。常用于工具类、实用类的对象创建。
 * 缺点：不能被子类继承，难以扩展。
 *
 * @author JohnieCheng
 * @version 1.0
 * @date 2024/9/4 10:40
 */
package com.johnie.d_staticfactorymethod;