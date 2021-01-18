package com.javacode2018.lesson001.demo9;

import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 14:23
 */
public class SetterBean {
    public interface IService {} //@1

    public static class ServiceA implements IService {} //@2

    public static class ServiceB implements IService {} //@3

    private IService service;

   /* public void setService(IService service) {
        this.service = service;
    }*/
    public void setService1(List<IService> service) {//@0
        System.out.println(service); //@1
    }

    @Override
    public String toString() {
        return "SetterBean{" +
                "service=" + service +
                '}';
    }
}
