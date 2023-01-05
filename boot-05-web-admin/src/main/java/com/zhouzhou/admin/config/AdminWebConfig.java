package com.zhouzhou.admin.config;

import com.zhouzhou.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.rmi.registry.Registry;

/**
 * @author 周万宁
 * @className AdminWebConfig
 * @create 2023/1/5-4:42
 * @description
 *
 * 1.编写一个拦截器实现HandlerInterceptor接口
 * 2.拦截器注册到容器中(实现WebMvcConfigurer的addInterceptors)
 * 3.指定拦截规则[如果是拦截所有,静态资源也会被拦截]
 *@EnableWebMvc:全面接管
 * 1.静态资源?视图解析器?欢迎页....全部失效
 * @EnableWebMvc慎用
 * 2.web应用 编写一个配置类实现webMvcConfigurer即可定制化web功能
 */
//@EnableWebMvc
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/imgs/**","/js/**");
    }

    //定义静态资源

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 访问 /aa/** 所有请求都去classpath:/static/去找
         */
        registry.addResourceHandler("/aa/**")
               .addResourceLocations("classpath:/static/");
    }

}
