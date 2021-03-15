package com.dy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/15 22:28
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello study man";
    }
}
