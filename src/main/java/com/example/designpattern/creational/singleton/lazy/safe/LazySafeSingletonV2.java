package com.example.designpattern.creational.singleton.lazy.safe;

import com.example.designpattern.creational.singleton.SingletonThread;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 单例模式  懒汉式  ---线程安全的，优化版本2：双重检查+volatile
 * @Date: Created in 2021­02­15 16:00
 */
public class LazySafeSingletonV2 {

    private  volatile static LazySafeSingletonV2 lazySafeSingleton = null;

    //私有无参构造器  禁止外面: 可以直接创造对象
    private LazySafeSingletonV2(){

    }

    /**
     * 提供公共方法来创建对象
     * 方法: 双重检查 + volatile
     *      1、双重检查: 减小程序性能开销
     *      2、volatile: 解决不允许单线程重排序，保证所有线程处理完数据必须写回主内存，都可以看到变量 最新数据
     * @return
     */
    public  static LazySafeSingletonV2 getLazySafeSingleton(){
        if(lazySafeSingleton == null){
            synchronized(LazySafeSingletonV2.class){
                if(lazySafeSingleton == null){
                    lazySafeSingleton =  new LazySafeSingletonV2();
                }
            }
        }
        return lazySafeSingleton;
    }

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
