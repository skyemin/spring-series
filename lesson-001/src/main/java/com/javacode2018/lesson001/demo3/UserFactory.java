package com.javacode2018.lesson001.demo3;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 11:12
 */
public class UserFactory {
    public UserModel buildUser1() {
        System.out.println("----------------------1");
        UserModel userModel = new UserModel();
        userModel.setName("bean实例方法创建的对象!");
        return userModel;
    }

    public UserModel buildUser2(String name, int age) {
        System.out.println("----------------------2");
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}
