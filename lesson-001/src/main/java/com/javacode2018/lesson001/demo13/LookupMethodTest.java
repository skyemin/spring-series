package com.javacode2018.lesson001.demo13;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 15:22
 */
public class LookupMethodTest {

    @Test
    public void normalBean() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo13/normalBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        System.out.println(context.getBean(ServiceA.class)); //@1
        System.out.println(context.getBean(ServiceA.class)); //@2

        System.out.println("serviceB中的serviceA");
        ServiceB serviceB = context.getBean(ServiceB.class); //@3
        System.out.println(serviceB.getServiceA()); //@4
        System.out.println(serviceB.getServiceA()); //@5
    }

    @Test
    public void lookupmethod() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo13/lookupmethod.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        System.out.println(context.getBean(com.javacode2018.lesson001.demo13.ServiceA.class)); //@1
        System.out.println(context.getBean(com.javacode2018.lesson001.demo13.ServiceA.class)); //@2

        System.out.println("serviceB中的serviceA");
        com.javacode2018.lesson001.demo13.lookupmethod.ServiceB serviceB = context.getBean(com.javacode2018.lesson001.demo13.lookupmethod.ServiceB.class); //@3
        serviceB.say();
        serviceB.say();
    }
    @Test
    public void replacedmethod() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo13/replacedmethod.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        System.out.println(context.getBean(ServiceA.class)); //@1
        System.out.println(context.getBean(ServiceA.class)); //@2

        System.out.println("serviceB中的serviceA");
        com.javacode2018.lesson001.demo13.lookupmethod.ServiceB serviceB = context.getBean(com.javacode2018.lesson001.demo13.lookupmethod.ServiceB.class); //@3
        serviceB.say();
        serviceB.say();
    }

}