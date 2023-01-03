package com.zhouzhou.boot.bean;

/**
 * @author 周万宁
 * @className Pet
 * @create 2023/1/4-1:47
 * @description
 */
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
