package com.javacode2018.lesson002.demo12;

import org.springframework.stereotype.Component;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:04
 */
@Component
public class Service2 {
    public Service2() {
        System.out.println("create " + this.getClass());
    }
}