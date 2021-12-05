package com.example.designpattern.behavioral.strategy;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 策略方法包装类
 * @Date: Created in 2021­02­19 10:05
 */
public class StrategyPattern {

    private MethodInterface methodInterface;

    /**
     * 构造方法
     * @param methodInterface 策略类
     */
    public StrategyPattern(MethodInterface methodInterface){
        this.methodInterface = methodInterface;
    }

    /**
     * 执行具体的策略
     */
    public void excuteStrategy(){
        methodInterface.excute();
    }
}
