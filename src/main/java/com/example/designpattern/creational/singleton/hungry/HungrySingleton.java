package com.example.designpattern.creational.singleton.hungry;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 单例模式饿汉式
 * @Date: Created in 2021­02­14 22:46
 */

/**
 * 饿汉式和懒汉式的区别
 *      1、饿汉式: 类加载的时候就创建好了
 *          优点: 需要时候直接拿来用
 *          缺点: 不用时候，造成资源浪费，占用内存
 *
 *      2、懒汉式: 需要时候再去创建，懒加载原理
 *          优点: 不占用内存，需要时候才创建
 *          缺点:  有线程安全问题，需要处理
 *
 */
public class HungrySingleton {

    private final static HungrySingleton hungrySingleton;

    /**
     * 静态块初始化
     * 优点: 类加载的时候就创建好了
     * 缺点: 如果不用它的时候，占用内存，造成资源的浪费
     */
    static{
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
