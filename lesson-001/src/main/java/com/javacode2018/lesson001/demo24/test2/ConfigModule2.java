package com.javacode2018.lesson001.demo24.test2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:15
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 模块2配置类
 */
@Configuration
public class ConfigModule2 {
    @Bean
    public String module2() {
        return "我是模块2配置类！";
    }
}