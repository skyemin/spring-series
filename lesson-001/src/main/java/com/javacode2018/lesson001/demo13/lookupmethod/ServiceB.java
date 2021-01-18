package com.javacode2018.lesson001.demo13.lookupmethod;

import com.javacode2018.lesson001.demo13.ServiceA;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 15:21
 */
public class ServiceB  {

    private ServiceA serviceA;

    public void say() {
        ServiceA serviceA = this.getServiceA();
        System.out.println("this:" + this + ",serviceA:" + serviceA);
    }

    public ServiceA getServiceA() { //@1
        return null;
    }

}