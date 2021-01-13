package com.javacode2018.lesson001.demo5;


/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 14:26
 */
public class PersonModel {
    private UserModel userModel;
    private CarModel carModel;

    public PersonModel() {
    }

    public PersonModel(UserModel userModel, CarModel carModel) {
        this.userModel = userModel;
        this.carModel = carModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "userModel=" + userModel +
                ", carModel=" + carModel +
                '}';
    }
}