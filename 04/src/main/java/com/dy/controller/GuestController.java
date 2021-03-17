package com.dy.controller;

import com.dy.bean.Guest;
import com.dy.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/16 22:25
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/list")
    public String findAllGuest(Model model){
        List<Guest> allGuest = guestService.findAllGuest();
        model.addAttribute("list",allGuest);
        return "list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model,String name){
        Guest guestByName = guestService.findGuestByName(name);
        model.addAttribute("guest",guestByName);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("delete")
    public String delete(String name){
        guestService.delete(name);
        return "redirect:/guest/list";
    }
}
