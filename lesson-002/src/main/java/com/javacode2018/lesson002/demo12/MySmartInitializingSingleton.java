package com.javacode2018.lesson002.demo12;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 11:04
 */
@ComponentScan
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("所有bean初始化完毕！");
    }
}