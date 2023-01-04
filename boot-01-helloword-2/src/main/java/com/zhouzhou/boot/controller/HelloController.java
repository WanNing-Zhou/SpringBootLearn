package com.zhouzhou.boot.controller;

import com.zhouzhou.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周万宁
 * @className HelloController
 * @create 2023/1/4-6:12
 * @description
 */
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){

        return person;
    }

}
