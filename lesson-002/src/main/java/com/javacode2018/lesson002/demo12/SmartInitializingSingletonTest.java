package com.javacode2018.lesson002.demo12;

import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:04
 */
public class SmartInitializingSingletonTest {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MySmartInitializingSingleton.class);
        System.out.println("开始启动容器!");
        context.refresh();
        System.out.println("容器启动完毕!");
    }
    @Test
    public void test2() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("service1", BeanDefinitionBuilder.genericBeanDefinition(Service1.class).getBeanDefinition());
        factory.registerBeanDefinition("service2", BeanDefinitionBuilder.genericBeanDefinition(Service2.class).getBeanDefinition());
        factory.registerBeanDefinition("mySmartInitializingSingleton", BeanDefinitionBuilder.genericBeanDefinition(MySmartInitializingSingleton.class).getBeanDefinition());
        System.out.println("准备触发所有单例bean初始化");
        //触发所有bean初始化，并且回调 SmartInitializingSingleton#afterSingletonsInstantiated 方法
        factory.preInstantiateSingletons();
    }
}
