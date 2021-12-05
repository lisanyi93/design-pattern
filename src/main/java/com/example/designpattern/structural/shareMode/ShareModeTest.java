package com.example.designpattern.structural.shareMode;

/**
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 享元模式
 * @Date: Created in 17:22 2021/12/5
 */
public class ShareModeTest {

    /**
     * 享元模式: 提供了减少对象数量从而改善应用所需的对象结构的方式
     *
     * 1、类型: 结构模式
     *
     * 2、适用场景:
     *  ①常常应用于系统底层的开发，以便于解决系统的性能问题
     *
     *  ②系统有大量相似独享，需要缓冲池的场景
     *
     * 3、优缺点
     *  ①优点:
     *      减少对象的创建，降低内存中的对象的数量;
     *      减少内存之外的其他资源占用
     *  ②缺点:
     *      关注外部、内部的状态，关注线程安全问题
     *
     *      使系统、程序的逻辑复杂化
     *
     *
     *
     * 4、案例: 不同部门经理做报告，报告对象创建了，就不要重复创建，就可以直接使用了
     *
     *
     *
     * 5、源码中体现:
     * 1、JDK中
     *  ①Integer valueOf() 方法
     *
     */

    private static final String[] departments = {"RD","QA","PM","BD"};

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            //随机让哪个部门经理来做报告
            String deparment = departments[(int) (Math.random() * departments.length)];

            Employee manager = EmployeeFactory.getManager(deparment);

            manager.report();
        }
    }



}
