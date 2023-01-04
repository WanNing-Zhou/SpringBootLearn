package com.zhouzhou.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周万宁
 * @className HelloController
 * @create 2023/1/4-19:20
 * @description
 */

@RestController
public class HelloController {

    @RequestMapping("/1.jpg")
    public String hello(){
        return "aaaa";
    }



}
