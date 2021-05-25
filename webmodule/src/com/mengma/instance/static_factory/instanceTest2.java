package com.mengma.instance.static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class instanceTest2 {
    @Test
    public void test(){
        String xmlPath = "com/mengma/instance/static_factory/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("person2"));
    }
}
