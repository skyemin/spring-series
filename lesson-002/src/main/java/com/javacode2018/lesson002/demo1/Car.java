package com.javacode2018.lesson002.demo1;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/22 16:25
 */
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}