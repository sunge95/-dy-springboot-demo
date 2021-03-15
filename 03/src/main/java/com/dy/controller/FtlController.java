package com.dy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/16 0:02
 */
@Controller
public class FtlController {

    @RequestMapping("/ftl")
    public String index(Model model){
        model.addAttribute("now",new Date().toString());
        return "freemarker/index";
    }
}
