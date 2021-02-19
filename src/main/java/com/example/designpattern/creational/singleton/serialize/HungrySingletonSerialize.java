package com.example.designpattern.creational.singleton.serialize;

import java.io.Serializable;

public class HungrySingletonSerialize implements Serializable {

    private final static HungrySingletonSerialize hungrySingleton;

    /**
     * 静态块初始化
     * 优点: 类加载的时候就创建好了
     * 缺点: 如果不用它的时候，占用内存，造成资源的浪费
     */
    static{
        hungrySingleton = new HungrySingletonSerialize();
    }

    private HungrySingletonSerialize(){
    }

    public static HungrySingletonSerialize getInstance(){
        return hungrySingleton;
    }

    //在单例对象中,添加这个方法，可防止序列化和反序列化不一致
    private Object readResolve(){
        return hungrySingleton;
    }
}