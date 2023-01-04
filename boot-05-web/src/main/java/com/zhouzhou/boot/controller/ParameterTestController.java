package com.zhouzhou.boot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 周万宁
 * @className ParameterTestController
 * @create 2023/1/5-0:29
 * @description
 */
@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam Map<String,String> params,
                                     @CookieValue("_ga") String _ga,
                                     @CookieValue("_ga") Cookie cookie,
                                     @RequestBody  String content  //获取请求体




    ){
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        return map;
    }

    //1,语法 /cars/sell;low=34;brand=bye,audi,yd
    //2.springboot默认是禁用了矩阵变量的功能
    // 手动开启: 原理:对于路径的处理,都是使用urlpathhelper进行解析,removeSemicolonContent 移除分号内容
    //3.矩阵变量必须有url路径变量才能被解析

    @GetMapping("/car/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand")List<String> brand,
                        @PathVariable("path") String path){
        Map<String,Object> map = new HashMap<>();
        return map;
    }

    // /boss/1;age=20/2;age=10

    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(
            @MatrixVariable(value = "age",pathVar = "bossId") Integer bossId,
           @MatrixVariable(value = "age",pathVar = "empId") Integer empId


    ){


        Map<String, Object> map = new HashMap<>();
        return map;

    }


}
