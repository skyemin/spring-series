package com.javacode2018.lesson001.demo25;

import com.javacode2018.lesson001.demo25.test1.IService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 16:03
 */
public class OnMissingBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        Map<String, IService> serviceMap = beanFactory.getBeansOfType(IService.class);
        return serviceMap.isEmpty();
    }
}
