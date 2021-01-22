package com.javacode2018.lesson001.demo25;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 15:57
 */
public class MyCondition1 implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }

}
