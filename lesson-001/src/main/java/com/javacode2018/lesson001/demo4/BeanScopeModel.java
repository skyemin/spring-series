package com.javacode2018.lesson001.demo4;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 11:41
 */
public class BeanScopeModel {
    public BeanScopeModel(String beanScope) {
        System.out.println(String.format("create BeanScopeModel,{sope=%s},{this=%s}", beanScope, this));
    }
}
