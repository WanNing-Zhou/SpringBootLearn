package com.zhouzhou.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 * @author 周万宁
 * @className WebConfig
 * @create 2023/1/4-23:50
 * @description
 */
@Configuration(proxyBeanMethods = false)
//public class WebConfig implements WebMvcConfigurer {
public class WebConfig {

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        hiddenHttpMethodFilter.setMethodParam("_m");
        return hiddenHttpMethodFilter;
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {

                UrlPathHelper urlPathHelper = new UrlPathHelper();
                //不移除; 后面的内容,矩阵变量功能就可以生效
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }
        };
    }


//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//
//        UrlPathHelper urlPathHelper = new UrlPathHelper();
//        //不移除; 后面的内容,矩阵变量功能就可以生效
//        urlPathHelper.setRemoveSemicolonContent(false);
//
//        configurer.setUrlPathHelper(urlPathHelper);
//
//    }
}
