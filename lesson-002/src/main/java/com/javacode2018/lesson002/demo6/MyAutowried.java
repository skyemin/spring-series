package com.javacode2018.lesson002.demo6;

import java.lang.annotation.*;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 9:54
 */
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowried {
}
