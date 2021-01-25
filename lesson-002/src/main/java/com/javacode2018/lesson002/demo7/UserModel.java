package com.javacode2018.lesson002.demo7;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 10:26
 */
public class UserModel {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
