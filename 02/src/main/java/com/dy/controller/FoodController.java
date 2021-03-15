package com.dy.controller;

import com.dy.Config.FoodConfig;
import com.dy.bean.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/15 22:45
 */
@RestController
public class FoodController {

    /**
     * 第一种方法
     * @return
     */
    @RequestMapping("/food1")
    public String food1(){
        Food food = new Food("大米1","猪肉1",null);
        return food.toString();
    }

    /**
     * 2种
     * @Value 通过${}结构获得配置文件中属性值
     * 当使用@Value时，指定位置配置文件必须有赋值
     */
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;

    @RequestMapping("/food2")
    public String food2(){
        Food food = new Food(rice,meat,null);
        return food.toString();
    }

    /**
     *  第三种：官方推荐
     * @return
     */
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/food3")
    public String food3(){
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setMeat(foodConfig.getMeat());
        food.setSauce(foodConfig.getSauce());
        return food.toString();
    }
}
