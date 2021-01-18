package com.javacode2018.lesson001.demo24.test4;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:25
 */
public class Service2 {
    private Service1 service1;

    public Service1 getService1() {
        return service1;
    }

    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
