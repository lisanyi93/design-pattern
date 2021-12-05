package com.example.designpattern.structural.strategy;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 策略模式测试类
 * @Date: Created in 2021­02­19 9:57
 */
public class StrategyTest {

    /**
     * 版本1
     * @param args
     */
/*    public static void main(String[] args) {
        StrategyPattern strategyA = new StrategyPattern(new MethodA());
        StrategyPattern strategyB = new StrategyPattern(new MethodB());

        strategyA.excuteStrategy();
        strategyB.excuteStrategy();
    }*/

    /**
     * 版本2： 根据实际业务场景，传入什么参数，执行是策略
     * 缺点:  过多的if else判断
     * @param args
     */
/*    public static void main(String[] args) {
        String strategyKey = "A";

        StrategyPattern strategyPattern = null;
        if("A".equals(strategyKey)){
            strategyPattern = new StrategyPattern(new MethodA());
        }else if("B".equals(strategyKey)){
            strategyPattern = new StrategyPattern(new MethodB());
        }else if("C".equals(strategyKey)){
            strategyPattern = new StrategyPattern(new MethodC());
        }
        strategyPattern.excuteStrategy();
    }*/

    /**
     * 版本3： 策略模式+工厂模式
     * @param args
     */
    public static void main(String[] args) {
        String strategyKey = "A";
        MethodInterface strategy = StrategyFactory.getStrategy(strategyKey);
        strategy.excute();
    }

    /**
     * 更多源码中： 设计模式体现,可以多去看看
     *
     * 1、JDK
     *
     * 2、Spring
     *
     * 3、SpringBoot
     *
     * 4、SpringCloud
     */
}
