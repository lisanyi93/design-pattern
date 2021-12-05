package com.example.designpattern.behavioral.StateMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 19:10 2021/12/5
 */
public abstract class CourseVedioState {

    protected CourseVedioContext courseVedioContext;

    public void setCourseVedioContext(CourseVedioContext courseVedioContext) {
        this.courseVedioContext = courseVedioContext;
    }

    /**
     * 播放
     */
    public abstract void play();

    /**
     * 快进
     */
    public abstract void speed();

    /**
     * 暂停
     */
    public abstract void pause();

    /**
     * 停止
     */
    public abstract void stop();
}
