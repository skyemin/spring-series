package com.javacode2018.lesson002.demo12;

import org.springframework.stereotype.Component;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:06
 */
@Component
public class Service1 {

    public Service1() {
        System.out.println("create " + this.getClass());
    }
}
