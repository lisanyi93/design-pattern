package com.example.designpattern.structural.shareMode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 员工工厂类
 * @Date: Created in 17:34 2021/12/5
 */
public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    /**
     * 注意点: 多线程的情况下，要注意线程安全问题
     * @param deparment
     * @return
     */
    public static Employee getManager(String deparment){
        Manager manager = (Manager) EMPLOYEE_MAP.get(deparment);

        if (Objects.isNull(manager)){
            manager = new Manager(deparment);
            System.out.print("创建部门经理："+deparment);
            String reportContent = deparment+"部门汇报: 此次的报告的内容是.....................";
            manager.setReportContent(reportContent);
            System.out.println("创建报告："+reportContent);
            EMPLOYEE_MAP.put(deparment,manager);
        }
        return manager;
    }
}
