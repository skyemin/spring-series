package com.javacode2018.lesson001.demo26.test4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/21 10:48
 */
@Component
public class Service3 {

    @Autowired
    private Service1 service1;//@1

    @Autowired
    private Service2 service2;//@2

    @Override
    public String toString() {
        return "Service3{" +
                "service1=" + service1 +
                ", service2=" + service2 +
                '}';
    }
}
