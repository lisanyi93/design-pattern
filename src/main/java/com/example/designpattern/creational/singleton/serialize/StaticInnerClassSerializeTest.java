package com.example.designpattern.creational.singleton.serialize;

import com.example.designpattern.creational.singleton.lazy.safe.LazySafeSingletonV3;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021­02­17 23:36
 */
public class StaticInnerClassSerializeTest {

    public static void main(String[] args) throws Exception {
        LazySafeSingletonV3 instance = LazySafeSingletonV3.getInstance();

        //输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        //输入流
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        LazySafeSingletonV3 newInstance  = (LazySafeSingletonV3) ois.readObject();

        /**
         * 测试内部类单例对象： 序列化和反序列化后，是同一对象不
         * 答案： 不是
         */
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
