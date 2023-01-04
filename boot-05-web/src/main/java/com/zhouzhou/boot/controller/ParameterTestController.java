package com.zhouzhou.boot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
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


}
