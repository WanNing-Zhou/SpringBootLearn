package com.zhouzhou.boot.controller;

import com.zhouzhou.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周万宁
 * @className HelloController
 * @create 2023/1/4-0:01
 * @description
 */

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private Car car;

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,Spring Boot 2";
    }

    @RequestMapping("/car")
    public Car car(){
        log.info("请求进来了");
        return car;
    }

}
