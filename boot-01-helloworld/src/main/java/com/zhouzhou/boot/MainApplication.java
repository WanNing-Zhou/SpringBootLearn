package com.zhouzhou.boot;

import com.zhouzhou.boot.bean.Pet;
import com.zhouzhou.boot.bean.User;
import com.zhouzhou.boot.config.MyConfig;
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

        //获取组件
        Pet tom1 = run.getBean(Pet.class);

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@configuration(proxyBeanMethods = true)代理对象调用方法,SpringBoot总会检查这个组件是否在容器中有
        //保持组件单实例

        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user==user1);

    }

}
