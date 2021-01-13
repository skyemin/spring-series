package com.javacode2018.lesson001.demo6;

import com.javacode2018.lesson001.demo5.IocUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 14:49
 */
public class DiAutowireTest {

    /**
     * 按照名称进行注入
     */
    @Test
    public void diAutowireByName() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo6/diAutowireByName.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByName2"));
    }
    /**
     * 按照set方法参数类型进行注入
     */
    @Test
    public void diAutowireByType() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo6/diAutowireByType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByType1"));
    }

    /**
     * 按照类型注入集合
     */
    @Test
    public void diAutowireByTypeExtend() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo6/diAutowireByTypeExtend.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        //从容器中获取DiAutowireByTypeExtend
        DiAutowireByTypeExtend diAutowireByTypeExtend = context.getBean(DiAutowireByTypeExtend.class);
        //输出diAutowireByTypeExtend中的属性看一下
        System.out.println("serviceList：" + diAutowireByTypeExtend.getServiceList());
        System.out.println("baseServieList：" + diAutowireByTypeExtend.getBaseServieList());
        System.out.println("service1Map：" + diAutowireByTypeExtend.getService1Map());
        System.out.println("baseServieMap：" + diAutowireByTypeExtend.getBaseServieMap());
    }
    /**
     * 构造函数的方式进行自动注入
     */
    @Test
    public void diAutowireByConstructor() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo6/diAutowireByConstructor.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByConstructor"));
    }
}
