package com.example.designpattern.behavioral.StateMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 状态模式
 * @Date: Created in 19:05 2021/12/5
 */
public class StateModeTest {


    /**
     * 状态模式： 允许一个对象在其内部状态改变时候，改变它的行为
     *
     * 1、类型: 行为型
     *
     *
     * 2、适用场景: 一个对象存在多个状态(不同状态下行为不同)，且状态可相互转换
     *
     * 3、优点
     *      将不同的状态隔离
     *
     *      把各种状态的转换逻辑，分布在state的子类中，减少相互间依赖
     *
     *      增加新的状态非常简单
     *
     * 4、缺点
     *      状态多的业务场景导致类的数目增加，系统变复杂
     *
     *
     *
     * 5、相关模式
     *      状态模式和享元模式
     *
     *
     *
     *
     */


    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        CourseVedioContext courseVedioContext = new CourseVedioContext();
        courseVedioContext.setCourseVedioState(new PlayState());
        System.out.println("当前状态: "+courseVedioContext.getCourseVedioState().getClass().getSimpleName());

        courseVedioContext.pause();
        System.out.println("当前状态: "+courseVedioContext.getCourseVedioState().getClass().getSimpleName());

        courseVedioContext.speed();
        System.out.println("当前状态: "+courseVedioContext.getCourseVedioState().getClass().getSimpleName());

        courseVedioContext.stop();
        System.out.println("当前状态: "+courseVedioContext.getCourseVedioState().getClass().getSimpleName());

        courseVedioContext.pause();
        System.out.println("当前状态: "+courseVedioContext.getCourseVedioState().getClass().getSimpleName());
    }
}
