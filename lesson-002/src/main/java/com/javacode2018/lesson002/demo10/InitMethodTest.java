package com.javacode2018.lesson002.demo10;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:01
 */

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 初始化方法测试
 */
public class InitMethodTest {

    @Test
    public void test1() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition service = BeanDefinitionBuilder.genericBeanDefinition(Service.class).
                setInitMethodName("init"). //@1：指定初始化方法
                getBeanDefinition();

        factory.registerBeanDefinition("service", service);

        System.out.println(factory.getBean("service"));
    }
}