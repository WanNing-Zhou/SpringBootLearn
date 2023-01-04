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
 *
 * 1.编写一个拦截器实现HandlerInterceptor接口
 * 2.拦截器注册到容器中(实现WebMvcConfigurer的addInterceptors)
 * 3.指定拦截规则[如果是拦截所有,静态资源也会被拦截]
 *
 *
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
