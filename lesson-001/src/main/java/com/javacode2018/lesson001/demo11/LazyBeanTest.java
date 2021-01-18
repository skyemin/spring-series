package com.javacode2018.lesson001.demo11;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * 所谓延迟初始化，就是和实时初始化刚好相反，延迟初始化的bean在容器启动过程中不会创建，而是需要使用的时候才会去创建，先说一下bean什么时候会被使用：
 * 被其他bean作为依赖进行注入的时候，比如通过property元素的ref属性进行引用，通过构造器注入、通过set注入、通过自动注入，这些都会导致被依赖bean的创建
 * 开发者自己写代码向容器中查找bean的时候，如调用容器的getBean方法获取bean。
 * @date 2021/1/14 14:42
 */
public class LazyBeanTest {

    @Test
    public void actualTimeBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/javacode2018/lesson001/demo11/actualTimeBean.xml";
        new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
    }
    @Test
    public void lazyInitBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/javacode2018/lesson001/demo11/lazyInitBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
        System.out.println("从容器中开始查找LazyInitBean");
        LazyInitBean lazyInitBean = context.getBean(LazyInitBean.class);
        System.out.println("LazyInitBean:" + lazyInitBean);
    }
    @Test
    public void actualTimeDependencyLazyBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/javacode2018/lesson001/demo11/actualTimeDependencyLazyBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
    }
}
