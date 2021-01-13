package com.javacode2018.lesson001.demo6;

import java.util.Collection;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/13 14:36
 */
public class Test {

    @org.junit.Test
    public void isAssignableFrom(){
        System.out.println(Object.class.isAssignableFrom(Integer.class)); //true
        System.out.println(Object.class.isAssignableFrom(int.class)); //false
        System.out.println(Object.class.isAssignableFrom(List.class)); //true
        System.out.println(Collection.class.isAssignableFrom(List.class)); //true
        System.out.println(List.class.isAssignableFrom(Collection.class)); //false
    }
}
