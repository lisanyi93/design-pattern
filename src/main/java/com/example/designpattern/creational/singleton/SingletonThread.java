package com.example.designpattern.creational.singleton;

import com.example.designpattern.creational.singleton.containerInstance.ContainerInstance;
import com.example.designpattern.creational.singleton.lazy.noSafe.LazyNoSafeSingleton;
import com.example.designpattern.creational.singleton.lazy.safe.LazySafeSingletonV1;
import com.example.designpattern.creational.singleton.lazy.safe.LazySafeSingletonV2;
import com.example.designpattern.creational.singleton.lazy.safe.LazySafeSingletonV3;
import com.example.designpattern.creational.singleton.threadLocalInstance.ThreadLocalInstance;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 单例模式  线程执行类
 * @Date: Created in 2021­02­15 16:03
 */
public class SingletonThread implements Runnable {

    @Override
    public void run() {
        /**
         * 线程不安全的
         */
        //懒汉式实现
        //LazyNoSafeSingleton instance = LazyNoSafeSingleton.getLazyNoSafeSingleton();
        //容器实现   缺点: debug模拟多线程访问, 线程不安全
        //ContainerInstance.put("object",new Object());
        //Object instance = ContainerInstance.getInstance("object");
        //ThreadLocal实现  缺点: 多线程会有线程安全问题，但是单线程永远是同一对象
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        /**
         * 线程安全的
         */
        //同步方法实现
        //LazySafeSingletonV1 instance = LazySafeSingletonV1.getLazySafeSingleton();
        //双重检查+volatile实现
        //LazySafeSingletonV2 instance = LazySafeSingletonV2.getLazySafeSingleton();
        //静态内部类实现
        //LazySafeSingletonV3 instance = LazySafeSingletonV3.getInstance();

        System.out.println(Thread.currentThread().getName() + "---" +instance);
    }
}
