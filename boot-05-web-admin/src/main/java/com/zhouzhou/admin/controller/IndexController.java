package com.zhouzhou.admin.controller;


import com.zhouzhou.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author 周万宁
 * @className IndexController
 * @create 2023/1/5-3:04
 * @description
 */

@Controller
public class IndexController {

    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";

    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){

        if(!user.getUserName().equals("")&&!user.getPassword().equals(""))
        {
            session.setAttribute("loginUser",user);
            //登录成功重定向到main页面
            return "redirect:/main.html";
        }
        else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }

    }


    @GetMapping("/main.html")
    public String mainPage(HttpSession session){

        Object user = session.getAttribute("loginUser");
        if(user!=null){
            return "main";
        }else{
            return "login";
        }

    }

}
