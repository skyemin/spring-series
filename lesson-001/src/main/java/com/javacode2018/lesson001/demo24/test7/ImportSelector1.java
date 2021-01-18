package com.javacode2018.lesson001.demo24.test7;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:50
 */
public class ImportSelector1 implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Configuration1.class.getName()};
    }
}
