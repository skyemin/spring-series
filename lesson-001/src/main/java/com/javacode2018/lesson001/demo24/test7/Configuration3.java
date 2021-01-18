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
public class Configuration3 {
    @Bean
    public String name3() {
        System.out.println("name3");
        return "name3";
    }
}
