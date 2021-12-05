package com.example.designpattern.behavioral.StateMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 19:10 2021/12/5
 */
public class CourseVedioContext {

    private CourseVedioState courseVedioState;

    public final static PlayState PLAY_STATE = new PlayState();

    public final static SpeedState SPEED_STATE = new SpeedState();

    public final static PauseState PAUSE_STATE = new PauseState();

    public final static StopState STOP_STATE = new StopState();

    public CourseVedioState getCourseVedioState() {
        return courseVedioState;
    }

    public void setCourseVedioState(CourseVedioState courseVedioState) {
        this.courseVedioState = courseVedioState;
        this.courseVedioState.setCourseVedioContext(this);
    }

    public void play(){
        this.courseVedioState.play();
    }

    public void speed(){
        this.courseVedioState.speed();
    }

    public void pause(){
        this.courseVedioState.pause();
    }

    public void stop(){
        this.courseVedioState.stop();
    }
}
