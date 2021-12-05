package com.example.designpattern.behavioral.chainMode;

import org.springframework.util.StringUtils;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 手记处理类
 * @Date: Created in 21:49 2021/12/5
 */
public class ArticleApprover extends Approver{


    @Override
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())){
            System.out.println(course.getName()+"含有手记,批准！");
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有手记,不批准！");
        }
    }
}
