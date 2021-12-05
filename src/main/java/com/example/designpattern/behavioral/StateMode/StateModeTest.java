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
     * 状态模式
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
