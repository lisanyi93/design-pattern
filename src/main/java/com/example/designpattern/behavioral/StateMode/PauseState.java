package com.example.designpattern.behavioral.StateMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 暂停状态
 * @Date: Created in 19:16 2021/12/5
 */
public class PauseState extends CourseVedioState{
    @Override
    public void play() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放视频的状态");
    }

    @Override
    public void stop() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.STOP_STATE);
    }
}
