package com.zhouzhou.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 周万宁
 * @className MainApplication
 * @create 2023/1/3-23:52
 * @description
 */

/**
 * @SpringBootApplication:这是一个springboot应用
 */

@SpringBootApplication(scanBasePackages = "com.zhouzhou.boot")
public class MainApplication {

    public static void main(String[] args) {
        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2.查看容器的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String s : beanDefinitionNames){
            System.out.println(s);
        }

    }

}
