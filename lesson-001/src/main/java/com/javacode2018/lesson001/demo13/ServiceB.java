package com.javacode2018.lesson001.demo13;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 15:21
 */
public class ServiceB implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private ServiceA serviceA;

    public ServiceA getServiceA() {
        return applicationContext.getBean(ServiceA.class);
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}