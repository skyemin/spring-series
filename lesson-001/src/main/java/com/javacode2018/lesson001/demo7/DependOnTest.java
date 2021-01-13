package com.javacode2018.lesson001.demo7;

import com.javacode2018.lesson001.demo5.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 15:40
 */
public class DependOnTest {

    /**
     * 无依赖的bean创建和销毁的顺序
     * bean对象的创建顺序和bean xml中定义的顺序一致
     * bean销毁的顺序和bean xml中定义的顺序相反
     */
    @Test
    public void normalBean() {
        System.out.println("容器启动中!");
        String beanXml = "classpath:/com/javacode2018/lesson001/demo7/normalBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕，准备关闭spring容器!");
        //关闭容器
        context.close();
        System.out.println("spring容器已关闭!");
    }

    /**
     * 强依赖的bean的创建和销毁顺序测试
     */
    @Test
    public void strongDependenceBean() {
        System.out.println("容器启动中!");
        String beanXml = "classpath:/com/javacode2018/lesson001/demo7/strongDependenceBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕，准备关闭spring容器!");
        context.close();
        System.out.println("spring容器已关闭!");
    }
    /**
     * 通过depend-on来干预bean创建和销毁顺序
     */
    @Test
    public void dependOnBean() {
        System.out.println("容器启动中!");
        String beanXml = "classpath:/com/javacode2018/lesson001/demo7/dependOnBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕，准备关闭spring容器!");
        context.close();
        System.out.println("spring容器已关闭!");
    }
}
