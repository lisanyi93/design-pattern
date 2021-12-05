package com.example.designpattern.behavioral.StateMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 播放状态
 * @Date: Created in 19:16 2021/12/5
 */
public class PlayState extends CourseVedioState{

    @Override
    public void play() {
        System.out.println("正常播放视频的状态");
    }

    @Override
    public void speed() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.STOP_STATE);
    }
}
