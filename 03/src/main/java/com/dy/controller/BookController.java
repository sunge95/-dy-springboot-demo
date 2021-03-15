package com.dy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/16 0:34
 */
@Controller
public class BookController {

    @RequestMapping("/book")
    public String book(){
        return "/book";
    }
}
