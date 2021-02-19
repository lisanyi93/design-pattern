package com.example.designpattern.creational.singleton.reflex;

import java.io.Serializable;

public class HungrySingletonReflex implements Serializable {

    private final static HungrySingletonReflex hungrySingleton;

    /**
     * 静态块初始化
     * 优点: 类加载的时候就创建好了
     * 缺点: 如果不用它的时候，占用内存，造成资源的浪费
     */
    static{
        hungrySingleton = new HungrySingletonReflex();
    }

    private HungrySingletonReflex(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingletonReflex getInstance(){
        return hungrySingleton;
    }


}