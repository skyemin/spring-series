package com.javacode2018.lesson001.demo16;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 17:45
 */
public class ServiceA implements IService {
    @Override
    public void m1() {
        System.out.println("我是ServiceA中的m1方法!");
    }

    @Override
    public void m2() {
        System.out.println("我是ServiceA中的m2方法!");
    }

    @Override
    public void m3() {
        System.out.println("我是ServiceA中的m3方法!");
    }
}
