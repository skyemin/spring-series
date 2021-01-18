package com.javacode2018.lesson001.demo24;

import com.javacode2018.lesson001.demo24.test1.MainConfig1;
import com.javacode2018.lesson001.demo24.test2.MainConfig2;
import com.javacode2018.lesson001.demo24.test4.MainConfig4;
import com.javacode2018.lesson001.demo24.test4.MyImportBeanDefinitionRegistrar;
import com.javacode2018.lesson001.demo24.test6.MainConfig6;
import com.javacode2018.lesson001.demo24.test6.Service1;
import com.javacode2018.lesson001.demo24.test6.Service2;
import com.javacode2018.lesson001.demo24.test7.MainConfig7;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:10
 */
public class ImportTest {

    @Test
    public void test1() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        //2.输出容器中定义的所有bean信息
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }
    @Test
    public void test2() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        //2.输出容器中定义的所有bean信息
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }
    @Test
    public void test4() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        //2.输出容器中定义的所有bean信息
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }
    @Test
    public void test6() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
        Service1 service1 = context.getBean(Service1.class);
        Service2 service2 = context.getBean(Service2.class);
        service1.m1();
        service2.m1();
    }
    @Test
    public void test7() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig7.class);
    }
}
