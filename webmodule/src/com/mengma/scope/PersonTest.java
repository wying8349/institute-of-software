package com.mengma.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void test1() {
        // 定义Spring配置文件路径
        String xmlPath = "com/mengma/scope/applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // 输出获得实例
        System.out.println(applicationContext.getBean("person"));
        System.out.println(applicationContext.getBean("person"));
    }

    @Test
    public void test2() {
        // 定义Spring配置文件路径
        String xmlPath = "com/mengma/scope/applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // 输出获得实例
        System.out.println(applicationContext.getBean("person"));
        System.out.println(applicationContext.getBean("person"));
    }
}