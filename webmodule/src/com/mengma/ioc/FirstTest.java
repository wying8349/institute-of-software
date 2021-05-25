package com.mengma.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FirstTest {
    @Test
    public void test1() {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        personDao.add();
    }
}

