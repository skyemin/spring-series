package com.javacode2018.lesson001.demo5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 14:20
 */
public class DiTest {

    /**
     * 通过构造器的参数类型注入
     */
    @Test
    public void diByConstructorParamType() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/beans.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamName"));
    }
    /**
     * 通过setter方法注入
     */
    @Test
    public void diBySetter() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diBySetter.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBySetter"));
    }
    /**
     * 注入javaBean
     */
    @Test
    public void diBean(){
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBeanByConstructor"));
        System.out.println(context.getBean("diBeanBySetter"));
    }
    /**
     * 其他各种类型注入
     */
    @Test
    public void diOtherType() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diOtherType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diOtherType"));
    }
}
