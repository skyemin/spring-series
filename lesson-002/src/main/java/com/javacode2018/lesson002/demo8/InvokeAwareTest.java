package com.javacode2018.lesson002.demo8;

import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 10:39
 */
public class InvokeAwareTest {

    @Test
    public void test1() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("awareBean", BeanDefinitionBuilder.genericBeanDefinition(AwareBean.class).getBeanDefinition());
        //调用getBean方法获取bean，将触发bean的初始化
        factory.getBean("awareBean");
    }
}
