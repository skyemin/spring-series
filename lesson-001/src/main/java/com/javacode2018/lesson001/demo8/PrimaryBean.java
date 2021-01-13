package com.javacode2018.lesson001.demo8;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 15:55
 */
public class PrimaryBean {
    public interface IService{} //@1
    public static class ServiceA implements IService{} //@2
    public static class ServiceB implements IService{} //@3

    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "PrimaryBean{" +
                "service=" + service +
                '}';
    }
}
