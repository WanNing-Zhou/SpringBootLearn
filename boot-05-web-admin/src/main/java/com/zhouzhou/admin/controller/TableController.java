package com.zhouzhou.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 周万宁
 * @className TableController
 * @create 2023/1/5-4:06
 * @description
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(){
        return "table/dynamic_table";
    }


    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }





}
