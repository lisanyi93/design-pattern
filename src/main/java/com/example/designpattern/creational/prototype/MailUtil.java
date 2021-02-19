package com.example.designpattern.creational.prototype;

import java.text.MessageFormat;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description：
 * @Date: Created in 2021­02­19 20:06
 */
public class MailUtil {

    public static void sendMail(Mail mail){
        String content = "向{0}同学，邮件地址{1},邮件内容{2},发送邮件成功!";
        System.out.println(MessageFormat.format(content,
                mail.getName(),
                mail.getMailAddress(),mail.getContent(),
                mail.getContent()
                )
        );
    }

    public static void saveOriginMail(Mail mail){
        System.out.println("存储originMail记录:"+mail);
    }
}
