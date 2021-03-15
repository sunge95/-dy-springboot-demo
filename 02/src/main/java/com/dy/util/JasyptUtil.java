package com.dy.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/15 23:37
 */
public class JasyptUtil {

    public static void main(String[] args) {
        // 注：不要导错包
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456@!");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("123456");
        System.out.println(username);
        System.out.println(password);

        //DZSNMfVw4U7tjalEUqVzOg==
        //9mRG2x17d4ORF7ZECLxakw==
    }
}
