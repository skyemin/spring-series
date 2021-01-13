package com.javacode2018.lesson001.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 10:25
 */
public class Client {

    public static void main(String[] args) {
        //1.bean配置文件位置
        //classpath代表classes路径
        String beanXml = "classpath:/com/javacode2018/lesson001/demo1/beans.xml";

        //2.创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        //3.从容器中获取需要的bean
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        //4.使用对象
        helloWorld.say();

    }
}
