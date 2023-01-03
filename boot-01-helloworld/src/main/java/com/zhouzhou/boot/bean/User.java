package com.zhouzhou.boot.bean;

/**
 * @author 周万宁
 * @className User
 * @create 2023/1/4-1:47
 * @description
 */
public class User {
    private String name;
    private Pet pet;

    public User(String name, Pet pet) {

        this.name = name;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
