package com.javacode2018.lesson001.demo16;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.ANNOTATION_TYPE)
public @interface Test {

    public String value() default "10";
}
