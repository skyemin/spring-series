package com.javacode2018.lesson001.demo25;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 16:01
 */
public class MainConfig4 {
    @Conditional(MyCondition1.class) //@1
    @Bean
    public String name() {
        return "路人甲Java";
    }

    @Bean
    public String address() {
        return "上海市";
    }
}
