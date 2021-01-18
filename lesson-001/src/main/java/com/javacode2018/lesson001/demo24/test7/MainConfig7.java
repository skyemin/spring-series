package com.javacode2018.lesson001.demo24.test7;

import org.springframework.context.annotation.Import;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:51
 */

@Import({
        DeferredImportSelector1.class,
        Configuration3.class,
        ImportSelector1.class,
})
public class MainConfig7 {
}
