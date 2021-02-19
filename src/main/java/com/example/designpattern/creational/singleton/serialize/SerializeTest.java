package com.example.designpattern.creational.singleton.serialize;

import java.io.*;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021­02­17 22:45
 */
public class SerializeTest {

    public static void main(String[] args) throws Exception {
        HungrySingletonSerialize instance = HungrySingletonSerialize.getInstance();

        //输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        //输入流
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingletonSerialize newInstance  = (HungrySingletonSerialize) ois.readObject();

        /**
         * 测试单例对象： 序列化和反序列化后，是同一对象不
         * 答案： 不是
         *
         * 解决方案：
         *      在单例对象中，加入方法readResolve
         *      因为： 反序列化过程中，是根据反射来进行初始化对象的，初始化对象会判断单例是否有: readResolve()方法
         */
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }
}
