package com.javacode2018.lesson002.demo13;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:08
 */
public class MyDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        System.out.println("准备销毁bean：" + beanName);
    }
}
