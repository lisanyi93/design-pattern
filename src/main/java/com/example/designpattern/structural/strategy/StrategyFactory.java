package com.example.designpattern.structural.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 工厂类
 * @Date: Created in 2021­02­19 10:37
 */
public class StrategyFactory {

    private static Map<String,MethodInterface> STRATEG_MAP = new HashMap<>();

    /**
     * 策略Key
     */
    public interface StrategyKey{
        String STRATEGY_A = "A";
        String STRATEGY_B = "B";
        String STRATEGY_C = "C";
    }

    /**
     * 静态代码块  初始赋值
     */
    static {
        STRATEG_MAP.put(StrategyKey.STRATEGY_A,new MethodA());
        STRATEG_MAP.put(StrategyKey.STRATEGY_B,new MethodB());
        STRATEG_MAP.put(StrategyKey.STRATEGY_C,new MethodC());
    }

    /**
     * 构建私有构造方法，防止外部直接构造对象
     */
    private StrategyFactory(){

    }

    //防止调用对象时，出现空指针，所以给定一个空对象，并赋予常量，避免多次创建对象
    private static final EmptyMethod EMPTY_METHOD = new EmptyMethod();

    //根据策略Key 获取不同的策略
    public static MethodInterface getStrategy(String key){
        MethodInterface methodInterface = STRATEG_MAP.get(key);
        return methodInterface == null? EMPTY_METHOD : methodInterface;
    }
}
