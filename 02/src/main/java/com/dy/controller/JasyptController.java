package com.dy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/15 23:47
 */
@RestController
public class JasyptController {

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuilder builder = new StringBuilder();
        builder.append(username);
        builder.append("\t");
        builder.append(password);
        return builder.toString();
    }
}
