package com.example.designpattern.behavioral.chainMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 责任链模式
 * @Date: Created in 21:05 2021/12/5
 */
public class ChainModeTest {

    /**
     * 责任链模式: 为请求创建一个接收此次请求对象的链
     *
     * 1、类型: 行为型
     *
     * 2、适用场景: 一个请求的处理需要多个对象当中的一个或几个协作处理
     *
     * 3、优点:
     *      请求的发送者和接受者(请求的处理)解耦
     *
     *      责任链可以动态组合
     */

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java培训");
        course.setArticle("Java培训手记");
        course.setVideo("Java培训视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
