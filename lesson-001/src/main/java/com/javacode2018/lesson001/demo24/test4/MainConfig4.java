package com.javacode2018.lesson001.demo24.test4;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/18 11:15
 */

import com.javacode2018.lesson001.demo24.test2.ConfigModule1;
import com.javacode2018.lesson001.demo24.test2.ConfigModule2;
import org.springframework.context.annotation.Import;

/**
 * 通过Import来汇总多个@Configuration标注的配置类
 */
@Import({MyImportBeanDefinitionRegistrar.class}) //@1
public class MainConfig4 {

}
