package com.javacode2018.lesson001.demo5;

import java.beans.ConstructorProperties;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 14:18
 */
public class CarModel {
    private String name;
    //描述信息
    private String desc;

    public CarModel() {
    }

    @ConstructorProperties({"name", "desc"})
    public CarModel(String p1, String p2) {
        this.name = p1;
        this.desc = p2;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
