package com.example.designpattern.behavioral.strategy;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021 0219 9:53
 */
public class EmptyMethod implements MethodInterface{


    @Override
    public void excute() {
        System.out.println("无策略方法");
    }
}
