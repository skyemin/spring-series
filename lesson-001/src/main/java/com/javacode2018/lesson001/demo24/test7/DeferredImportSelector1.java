package com.javacode2018.lesson001.demo24.test7;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:51
 */
public class DeferredImportSelector1 implements DeferredImportSelector, Ordered {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Configuration2.class.getName()};
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
