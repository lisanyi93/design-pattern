package com.example.designpattern.creational.singleton.threadLocalInstance;

import com.example.designpattern.creational.singleton.SingletonThread;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021­02­18 16:05
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocal.get();
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 多线程 有线程安全问题
         */
/*        Thread t1 = new Thread(new SingletonThread());
        Thread t2 = new Thread(new SingletonThread());
        t1.start();
        t2.start();
        System.out.println("Program end!");
        */

        /**
         * 单线程，永远是同一对象
         */
        System.out.println(Thread.currentThread().getName() + "---"+ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread().getName() + "---"+ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread().getName() + "---"+ThreadLocalInstance.getInstance());
    }
}
