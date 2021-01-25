package com.javacode2018.lesson002.demo1;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/22 17:23
 */
public class TestParseDefinition {

    /**
     * xml方式bean配置信息解析
     */
    @Test
    public void test1() {
        //定义一个spring容器，这个容器默认实现了BeanDefinitionRegistry，所以本身就是一个bean注册器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        //定义一个xml的BeanDefinition读取器，需要传递一个BeanDefinitionRegistry（bean注册器）对象
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);

        //指定bean xml配置文件的位置
        String location = "classpath:/com/javacode2018/lesson002/demo2/beans.xml";
        //通过XmlBeanDefinitionReader加载bean xml文件，然后将解析产生的BeanDefinition注册到容器容器中
        int countBean = xmlBeanDefinitionReader.loadBeanDefinitions(location);
        System.out.println(String.format("共注册了 %s 个bean", countBean));

        //打印出注册的bean的配置信息
        for (String beanName : factory.getBeanDefinitionNames()) {
            //通过名称从容器中获取对应的BeanDefinition信息
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
            //获取BeanDefinition具体使用的是哪个类
            String beanDefinitionClassName = beanDefinition.getClass().getName();
            //通过名称获取bean对象
            Object bean = factory.getBean(beanName);
            //打印输出
            System.out.println(beanName + ":");
            System.out.println("    beanDefinitionClassName：" + beanDefinitionClassName);
            System.out.println("    beanDefinition：" + beanDefinition);
            System.out.println("    bean：" + bean);
        }
    }
}
