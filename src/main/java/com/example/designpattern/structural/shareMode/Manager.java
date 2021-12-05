package com.example.designpattern.structural.shareMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 部门经理
 * @Date: Created in 17:26 2021/12/5
 */
public class Manager implements Employee{

    /**
     * 所属部门
     */
    private String department;

    /**
     * 报告内容
     */
    private String reportContent;

    /**
     * 作报告方法
     */
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
