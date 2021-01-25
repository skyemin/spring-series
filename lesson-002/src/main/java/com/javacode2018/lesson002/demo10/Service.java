package com.javacode2018.lesson002.demo10;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:00
 */
public class Service implements InitializingBean {
    public void init() {
        System.out.println("调用init()方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet()");
    }
}
