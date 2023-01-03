package com.zhouzhou.boot.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author 周万宁
 * @className Pet
 * @create 2023/1/4-1:47
 * @description
 */

@NoArgsConstructor//无参构造器
@AllArgsConstructor//全参构造器
public class Pet {
    private String name;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
