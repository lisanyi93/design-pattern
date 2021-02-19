package com.example.designpattern.creational.singleton.lazy.safe;

import com.example.designpattern.creational.singleton.SingletonThread;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 单例模式  懒汉式  ---线程安全的，优化版本1：对方法进行同步加锁
 * @Date: Created in 2021­02­15 16:00
 */
public class LazySafeSingletonV1 {

    private  static LazySafeSingletonV1 lazySafeSingleton = null;

    //私有无参构造器  禁止外面调用
    private LazySafeSingletonV1(){

    }

    /**
     * 提供公共方法来创建对象
     * 方法: 对方法进行加锁，synchronized
     * 缺点: 开销较大，等同于锁住了整个类
     * @return
     */
    public synchronized static LazySafeSingletonV1 getLazySafeSingleton(){
        if(lazySafeSingleton == null){
            lazySafeSingleton =  new LazySafeSingletonV1();
        }
        return lazySafeSingleton;
    }
    /**
     * 同步代码块。与同步方法一样，锁是类
     */
/*    public  static LazySafeSingletonV1 getLazySafeSingleton(){
        synchronized(LazySafeSingletonV1.class){
            if(lazySafeSingleton == null){
                lazySafeSingleton =  new LazySafeSingletonV1();
            }
        }
        return lazySafeSingleton;
    }*/

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new SingletonThread());
        Thread t2 = new Thread(new SingletonThread());
        t1.start();
        t2.start();
        System.out.println("Program end!");
    }

}
