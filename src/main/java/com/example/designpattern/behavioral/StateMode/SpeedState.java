package com.example.designpattern.behavioral.StateMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 快进状态
 * @Date: Created in 19:16 2021/12/5
 */
public class SpeedState extends CourseVedioState{

    @Override
    public void play() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放视频的状态");
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
