package com.example.designpattern.behavioral.StateMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 停止装填
 * @Date: Created in 19:17 2021/12/5
 */
public class StopState extends CourseVedioState{
    @Override
    public void play() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 停止状态不能快进!");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 停止状态不能暂停!");
    }

    @Override
    public void stop() {
        System.out.println("停止播放视频的状态");
    }
}
