package com.example.designpattern.creational.singleton.lazy.safe;

import com.example.designpattern.creational.singleton.SingletonThread;

import java.io.Serializable;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 单例模式  懒汉式  ---线程安全的，优化版本3：静态内部类
 * @Date: Created in 2021­02­15 16:00
 */
public class LazySafeSingletonV3 implements Serializable {

    //私有无参构造器  禁止外面: 可以直接创造对象
    private LazySafeSingletonV3(){
        if(InnerClass.lazySafeSingletonV3 != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 提供静态内部类来创建对象
     * 说明: 静态内部类是基于类初始化的延迟加载解决方案，实质是: 防止线程看到其他线程的重排序
     * @return
     */
     private static class InnerClass{
        private static LazySafeSingletonV3 lazySafeSingletonV3 = new LazySafeSingletonV3();
     }
     //提供公共方法来访问
    public static LazySafeSingletonV3 getInstance(){
         return InnerClass.lazySafeSingletonV3;
    }

    //在单例对象中,添加这个方法，可防止序列化和反序列化不一致
    private Object readResolve(){
        return InnerClass.lazySafeSingletonV3;
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
