package com.example.designpattern.behavioral.chainMode;

import org.springframework.util.StringUtils;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 视频处理类
 * @Date: Created in 21:53 2021/12/5
 */
public class VideoApprover extends Approver{


    @Override
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频,批准！");
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有视频,不批准！");
        }
    }


}
