package com.javacode2018.lesson001.demo25;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 15:58
 */
@Configuration
@Conditional(MyCondition1.class)
public class MainConfig3 {

    @Bean
    public String name() { //@1
        return "路人甲Java";
    }
}
