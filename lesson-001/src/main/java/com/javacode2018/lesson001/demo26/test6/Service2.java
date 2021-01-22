package com.javacode2018.lesson001.demo26.test6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/21 10:58
 */
@Component
public class Service2 {

    @Autowired
    private List<IService> services;

    @Autowired
    private Map<String, IService> serviceMap;

    @Override
    public String toString() {
        return "Service2{\n" +
                "services=" + services +
                ", \n serviceMap=" + serviceMap +
                '}';
    }
}