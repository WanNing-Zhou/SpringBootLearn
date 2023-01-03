package com.zhouzhou.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author 周万宁
 * @className Car
 * @create 2023/1/4-2:39
 * @description
 */

//只有在容器中的组件,才会有SpringBoot提供的强大功能

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;


}
