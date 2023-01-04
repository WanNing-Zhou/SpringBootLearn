package com.zhouzhou.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 周万宁
 * @className ViewTestController
 * @create 2023/1/5-2:40
 * @description
 */
@Controller
public class ViewTestController {

    @GetMapping("/zhouzhou")
    public String zhouzhou(Model model){


        //model中的数据会被放在请求域中 request.setAttribute("a","aa");
        model.addAttribute("msg","你好,周周");
        return "success";
    }
}
