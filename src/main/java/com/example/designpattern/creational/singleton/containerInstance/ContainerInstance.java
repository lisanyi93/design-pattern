package com.example.designpattern.creational.singleton.containerInstance;

import com.example.designpattern.creational.singleton.SingletonThread;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 容器单例模式  缺点: 线程不安全
 * @Date: Created in 2021­02­18 15:48
 */
public class ContainerInstance {
    //这里使用HashTable虽然线程安全，但是影响性能
    private static Map<String,Object> map = new HashMap<>();

    private ContainerInstance(){

    }

    //构建对象
    public static void put(String key,Object instance){
        if(!StringUtils.isEmpty(key) && Objects.nonNull(instance)){
            if(!map.containsKey(key)){
                map.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
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
