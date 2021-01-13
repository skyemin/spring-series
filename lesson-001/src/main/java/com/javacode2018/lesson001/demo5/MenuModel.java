package com.javacode2018.lesson001.demo5;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 14:23
 */
/**
 * 菜单类
 */
public class MenuModel {
    //菜单名称
    private String label;
    //同级别排序
    private Integer theSort;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getTheSort() {
        return theSort;
    }

    public void setTheSort(Integer theSort) {
        this.theSort = theSort;
    }

    @Override
    public String toString() {
        return "MenuModel{" +
                "label='" + label + '\'' +
                ", theSort=" + theSort +
                '}';
    }
}
