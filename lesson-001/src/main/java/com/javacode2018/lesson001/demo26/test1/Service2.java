package com.javacode2018.lesson001.demo26.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/21 10:18
 */
@Component
public class Service2 {

  private Service1 service1;

    @Autowired
    public void injectService1(Service1 service1) { //@1
        System.out.println(this.getClass().getName() + ".injectService1()");
        this.service1 = service1;
    }

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
