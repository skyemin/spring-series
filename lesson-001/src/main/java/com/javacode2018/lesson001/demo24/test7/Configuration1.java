package com.javacode2018.lesson001.demo24.test7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:49
 */
@Configuration
public class Configuration1 {
    @Bean
    public String name1() {
        System.out.println("name1");
        return "name1";
    }
}
