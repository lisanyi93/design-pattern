package com.example.designpattern.creational.prototype;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 邮件
 * @Date: Created in 2021­02­19 20:02
 */
public class Mail implements Cloneable{

    private String name;

    private String mailAddress;

    private String content;

    public Mail(){
        System.out.println("Mail Class Constructor!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
