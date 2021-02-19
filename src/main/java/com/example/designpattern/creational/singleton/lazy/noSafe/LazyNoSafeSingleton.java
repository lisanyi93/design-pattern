package com.example.designpattern.creational.singleton.lazy.noSafe;

import com.example.designpattern.creational.singleton.SingletonThread;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 单例模式  懒汉式(存在线程安全问题)
 * @Date: Created in 2021­02­15 16:00
 */
public class LazyNoSafeSingleton {

    private  static LazyNoSafeSingleton lazyNoSafeSingleton = null;

    //私有无参构造器  禁止外面调用
    private LazyNoSafeSingleton(){

    }

    /**
     * 提供公共方法来创建对象
     * 缺点:  存在线程安全问题
     * @return
     */
    public static LazyNoSafeSingleton getLazyNoSafeSingleton(){
        //当多个线程执行到这里时候,都会创建不同的对象
        if(lazyNoSafeSingleton == null){
            lazyNoSafeSingleton =  new LazyNoSafeSingleton();
        }
        return lazyNoSafeSingleton;
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
