package com.javacode2018.lesson001.demo20;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @Configuration注解修饰的类，会被spring通过cglib做增强处理，通过cglib会生成一个代理对象，代理会拦截所有被@Bean注解修饰的方法，可以确保一些bean是单例的
 * 不管@Bean所在的类上是否有@Configuration注解，都可以将@Bean修饰的方法作为一个bean注册到spring容器中
 * @date 2021/1/15 16:00
 */
@Configuration
public class ConfigBean {

    //bean名称为方法默认值：user1
    @Bean
    public User user1() {
        return new User();
    }

    //bean名称通过value指定了：user2Bean
    @Bean("user2Bean")
    public User user2() {
        return new User();
    }

    //bean名称为：user3Bean，2个别名：[user3BeanAlias1,user3BeanAlias2]
    @Bean({"user3Bean", "user3BeanAlias1", "user3BeanAlias2"})
    public User user3() {
        return new User();
    }
}
