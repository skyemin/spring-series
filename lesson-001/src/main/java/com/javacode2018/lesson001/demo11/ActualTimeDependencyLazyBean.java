package com.javacode2018.lesson001.demo11;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 15:02
 */
public class ActualTimeDependencyLazyBean {

    public ActualTimeDependencyLazyBean() {
        System.out.println("ActualTimeDependencyLazyBean实例化!");
    }

    private LazyInitBean lazyInitBean;

    public LazyInitBean getLazyInitBean() {
        return lazyInitBean;
    }

    public void setLazyInitBean(LazyInitBean lazyInitBean) {
        this.lazyInitBean = lazyInitBean;
        System.out.println("ActualTimeDependencyLazyBean.setLazyInitBean方法!");
    }
}