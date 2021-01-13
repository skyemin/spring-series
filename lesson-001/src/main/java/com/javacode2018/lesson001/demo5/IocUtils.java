package com.javacode2018.lesson001.demo5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 14:19
 */
public class IocUtils {
    public static ClassPathXmlApplicationContext context(String beanXml) {
        return new ClassPathXmlApplicationContext(beanXml);
    }
}
