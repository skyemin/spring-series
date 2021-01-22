package com.javacode2018.lesson001.demo26.test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/21 10:44
 */
@Component
public class Service2 {

    private Service1 service1;

    @Autowired
    public void injectService1(Service1 service1, @Autowired(required = false) String name) { //@1
        System.out.println(String.format("%s.injectService1(),{service1=%s,name=%s}", this.getClass().getName(), service1, name));
        this.service1 = service1;
    }

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
