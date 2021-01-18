package com.javacode2018.lesson001.demo9;

import com.javacode2018.lesson001.demo5.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/14 14:23
 */
public class AutowireCandidateTest {

    @Test
    public void setterBean() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo9/autowireCandidateBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean(SetterBean.class)); //@1

        SetterBean.IService service = context.getBean(SetterBean.IService.class); //@2
        System.out.println(service);
    }

}
