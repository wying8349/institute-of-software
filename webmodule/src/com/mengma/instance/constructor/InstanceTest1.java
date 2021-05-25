package com.mengma.instance.constructor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    @Test
    public void test() {
        String xmlPath = "com/mengma/instance/constructor/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("person1"));
    }
}
