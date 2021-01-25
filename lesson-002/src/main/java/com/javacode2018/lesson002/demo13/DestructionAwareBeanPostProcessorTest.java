package com.javacode2018.lesson002.demo13;

import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:08
 */
public class DestructionAwareBeanPostProcessorTest {
    @Test
    public void test1() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        //添加自定义的DestructionAwareBeanPostProcessor
        factory.addBeanPostProcessor(new MyDestructionAwareBeanPostProcessor());

        //向容器中注入3个单例bean
        factory.registerBeanDefinition("serviceA1", BeanDefinitionBuilder.genericBeanDefinition(ServiceA.class).getBeanDefinition());
        factory.registerBeanDefinition("serviceA2", BeanDefinitionBuilder.genericBeanDefinition(ServiceA.class).getBeanDefinition());
        factory.registerBeanDefinition("serviceA3", BeanDefinitionBuilder.genericBeanDefinition(ServiceA.class).getBeanDefinition());

        //触发所有单例bean初始化
        factory.preInstantiateSingletons(); //@1

        System.out.println("销毁serviceA1");
        //销毁指定的bean
        factory.destroySingleton("serviceA1");//@2

        System.out.println("触发所有单例bean的销毁");
        factory.destroySingletons();
    }
}
