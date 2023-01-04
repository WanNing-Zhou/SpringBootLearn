package com.zhouzhou.admin.config;

import com.zhouzhou.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.rmi.registry.Registry;

/**
 * @author 周万宁
 * @className AdminWebConfig
 * @create 2023/1/5-4:42
 * @description
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/imgs/**","/js/**");
    }
}
