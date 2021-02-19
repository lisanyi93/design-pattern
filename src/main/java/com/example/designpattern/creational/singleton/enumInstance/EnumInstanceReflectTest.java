package com.example.designpattern.creational.singleton.enumInstance;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021­02­17 23:18
 */
public class EnumInstanceReflectTest {
    public static void main(String[] args) throws Exception {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());


        Class objectClass = EnumInstance.class;
        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        //这里会直接抛错，不能通过反射创建对象
        EnumInstance newInstance = (EnumInstance) constructor.newInstance("Geely",666);

        /**
         * 测试枚举单例对象： 反射后，是同一对象不
         * 答案： 会直接抛错: Cannot reflectively create enum objects.
         *       相比普通反类射可以进行反射对象，枚举类会直接抛错
         */
        System.out.println("反射，枚举单例对象测试");
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
        System.out.println();
    }
}
