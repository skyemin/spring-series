package com.javacode2018.lesson001.demo13;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Method;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 15:29
 */
public class ServiceBMethodReplacer implements MethodReplacer, ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return this.applicationContext.getBean(ServiceA.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
