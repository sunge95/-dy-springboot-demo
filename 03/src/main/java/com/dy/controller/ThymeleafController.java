package com.dy.controller;

import com.dy.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/16 0:46
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/thyme")
    public String thyme(Model model){
        model.addAttribute("name","<h1>Thymeleaf</h1>");
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("狗");
        restaurant.setChef("猫");
        model.addAttribute("r",restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        //都不行
//        return "redirect:welcome";
//        return "redirect:thymeleaf/welcome";
        return "thymeleaf/welcome";
    }
}
