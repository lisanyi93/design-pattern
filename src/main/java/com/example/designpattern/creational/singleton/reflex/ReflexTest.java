package com.example.designpattern.creational.singleton.reflex;

import java.lang.reflect.Constructor;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021­02­17 23:05
 */
public class ReflexTest {
    public static void main(String[] args) throws Exception {
        HungrySingletonReflex instance = HungrySingletonReflex.getInstance();

        //反射
        Class objectClass = HungrySingletonReflex.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingletonReflex newInstance = (HungrySingletonReflex) constructor.newInstance();

        /**
         * 测试单例对象： 反射后，是同一对象不
         * 答案： 不是
         *
         * 解决方案：
         *      在私有构造器中，手动跑错: 单例构造器禁止反射调用
         */
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
