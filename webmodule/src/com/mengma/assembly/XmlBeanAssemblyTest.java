package com.mengma.assembly;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssemblyTest {
    @Test
    public void test() {
        // 定义Spring配置文件路径
        String xmlPath = "com/mengma/assembly/applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // 设值方式输出结果
        System.out.println(applicationContext.getBean("person1"));
        // 构造方式输出结果
        System.out.println(applicationContext.getBean("person2"));
    }
}