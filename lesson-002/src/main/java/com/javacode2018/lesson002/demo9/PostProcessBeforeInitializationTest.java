package com.javacode2018.lesson002.demo9;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 10:55
 */
public class PostProcessBeforeInitializationTest {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Bean1.class);
        context.refresh();
    }
}
