package com.javacode2018.lesson001.demo12;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 15:08
 */
public class ServiceC {
    private String name;
    private ServiceA serviceA;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public String toString() {
        return "ServiceB{" +
                "name='" + name + '\'' +
                ", serviceA=" + serviceA +
                '}';
    }
}
