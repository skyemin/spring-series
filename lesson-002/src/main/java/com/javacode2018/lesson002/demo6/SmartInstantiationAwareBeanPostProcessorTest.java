package com.javacode2018.lesson002.demo6;

import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 9:56
 */
public class SmartInstantiationAwareBeanPostProcessorTest {
    @Test
    public void test1() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        //创建一个SmartInstantiationAwareBeanPostProcessor,将其添加到容器中
        factory.addBeanPostProcessor(new MySmartInstantiationAwareBeanPostProcessor());

        factory.registerBeanDefinition("name",
                BeanDefinitionBuilder.
                        genericBeanDefinition(String.class).
                        addConstructorArgValue("路人甲Java").
                        getBeanDefinition());

        factory.registerBeanDefinition("age",
                BeanDefinitionBuilder.
                        genericBeanDefinition(Integer.class).
                        addConstructorArgValue(30).
                        getBeanDefinition());

        factory.registerBeanDefinition("person",
                BeanDefinitionBuilder.
                        genericBeanDefinition(Person.class).
                        getBeanDefinition());

        Person person = factory.getBean("person", Person.class);
        System.out.println(person);

    }
}
