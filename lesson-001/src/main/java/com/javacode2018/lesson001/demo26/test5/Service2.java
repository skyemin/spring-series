package com.javacode2018.lesson001.demo26.test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/21 10:49
 */
@Component
public class Service2 {
    @Autowired
    @Qualifier("service0")
    private IService service; //@1

    @Override
    public String toString() {
        return "Service2{" +
                "service=" + service +
                '}';
    }
}
