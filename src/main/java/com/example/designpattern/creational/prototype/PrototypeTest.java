package com.example.designpattern.creational.prototype;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 原型模式测试类
 * @Date: Created in 2021­02­19 20:05
 */
public class PrototypeTest {

    /**
     * 原型模式 版本1
     * 缺点: 保存原始对象时候，被最后一个循环对象覆盖了.  说明只是浅克隆了
     * @param args
     */
/*    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setName("初始姓名");
        mail.setMailAddress("初始地址");
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);

        for(int i = 0;i < 5;i++){
            mail.setName("姓名"+i);
            mail.setMailAddress("姓名"+i+"@imooc.com");
            mail.setContent("发送邮件内容");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMail(mail);
    }*/

    /**
     * 原型模式 版本2： 进行深克隆
     * 优化点:
     *    1、被复制对象，实现Cloneable接口
     * @param args
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setName("初始姓名");
        mail.setMailAddress("初始地址");
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);

        for(int i = 0;i < 5;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setMailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("发送邮件内容");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMail(mail);
    }

}
