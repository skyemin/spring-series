package com.javacode2018.lesson001.demo3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 11:01
 */
@ToString
@Setter
@Getter
public class UserModel {

    private String name;
    private int age;

    public UserModel() {
        this.name = "我是通过UserModel的无参构造方法创建的!";
    }

    public UserModel(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
