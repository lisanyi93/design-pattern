package com.example.designpattern.strategy;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021­02­19 9:53
 */
public class EmptyMethod implements MethodInterface{


    @Override
    public void excute() {
        System.out.println("无策略方法");
    }
}
