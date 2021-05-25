package com.mengma.instance.factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
    @Test
    public void test() {
        // 定义Spring配置文件的路径
        String xmlPath = "com/mengma/instance/factory/applicationContext.xml"; // 初始化Spring容器，加载配置文件，并对bean进行实例化
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // 通过容器获取id为person3实例
        System.out.println(applicationContext.getBean("person3"));
    }
}