package com.example.designpattern.creational.singleton.enumInstance;

import com.example.designpattern.creational.singleton.serialize.HungrySingletonSerialize;

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
public class EnumInstanceSerializeTest {
    public static void main(String[] args) throws Exception {
        /**
         * 序列化和反序列化
         */
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        //输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        //输入流
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance  = (EnumInstance) ois.readObject();

        /**
         * 测试枚举单例对象： 序列化和反序列化后，是同一对象不
         * 答案： 是
         */
        System.out.println("序列化和反序列化，枚举单例对象测试：");
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
        System.out.println();

        System.out.println("枚举类方法调用： ");
        instance.printTest();
    }
}
