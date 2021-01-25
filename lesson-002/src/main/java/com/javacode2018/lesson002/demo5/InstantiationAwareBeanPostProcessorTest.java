package com.javacode2018.lesson002.demo5;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 9:49
 */

import com.javacode2018.lesson002.demo1.Car;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.lang.Nullable;

/**
 * bean初始化前阶段，会调用：{@link org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessBeforeInitialization(Object, String)}
 */
public class InstantiationAwareBeanPostProcessorTest {
    @Test
    public void test1() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        //添加一个BeanPostProcessor：InstantiationAwareBeanPostProcessor
        factory.addBeanPostProcessor(new InstantiationAwareBeanPostProcessor() { //@1
            @Nullable
            @Override
            public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
                System.out.println("调用postProcessBeforeInstantiation()");
                //发现类型是Car类型的时候，硬编码创建一个Car对象返回
                if (beanClass == Car.class) {
                    Car car = new Car();
                    car.setName("保时捷");
                    return car;
                }
                return null;
            }
        });

        //定义一个car bean,车名为：奥迪
        AbstractBeanDefinition carBeanDefinition = BeanDefinitionBuilder.
                genericBeanDefinition(Car.class).
                addPropertyValue("name", "奥迪").  //@2
                getBeanDefinition();
        factory.registerBeanDefinition("car", carBeanDefinition);
        //从容器中获取car这个bean的实例，输出
        System.out.println(factory.getBean("car"));

    }
}
