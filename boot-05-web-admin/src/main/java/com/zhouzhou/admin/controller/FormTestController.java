package com.zhouzhou.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author 周万宁
 * @className FormTestController
 * @create 2023/1/5-5:03
 * @description
 */

@Controller
public class FormTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }


    /**
     * @MethodName upload
     * @Author 周万宁
     * @Description TODO
     * @Date 5:12 2023/1/5
     * @Param [email, username, headerImg, photos]
     * @return java.lang.String
     * multipart自动封装上传过来的文件
     **/
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestParam("headerImg")MultipartFile headerImg,
                         @RequestParam("photos") MultipartFile[] photos) throws IOException {

        if(!headerImg.isEmpty()){
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File(""));
        }

        if (photos.length>0){
            for (MultipartFile photo : photos){
                if(!photo.isEmpty()){
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File(""));
                }
            }
        }

        return "main";
    }


}
