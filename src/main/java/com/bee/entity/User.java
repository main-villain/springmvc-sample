package com.bee.entity;

import org.springframework.stereotype.Component;

/**
 * 项目名：springmvc-sample
 * 作者：汤竞祥
 * 日期：2016/11/11 19:33
 */
@Component
public class User {

    private int id;

    private String name;

    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
