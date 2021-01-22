package com.javacode2018.lesson001.demo26.test0;

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
    public Service2() { //@1
        System.out.println(this.getClass() + "无参构造器");
    }

    @Autowired
    public Service2(Service1 service1) { //@2
        System.out.println(this.getClass() + "有参构造器");
        this.service1 = service1;
    }

    @Override
    public String toString() { //@2
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
