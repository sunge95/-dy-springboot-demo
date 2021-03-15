package com.dy.controller;

import com.dy.Config.VegetableConfig;
import com.dy.bean.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/15 23:17
 */
@RestController
public class VegetableController {

    @Autowired
    private VegetableConfig vegetableConfig;

    @RequestMapping("/vegetable")
    public String vegetable(){
        Vegetables v = new Vegetables();
        v.setEggplant(vegetableConfig.getEggplant());
        v.setGreenpeper(vegetableConfig.getGreenpeper());
        v.setPotato(vegetableConfig.getPotato());
        return v.toString();
    }
}
