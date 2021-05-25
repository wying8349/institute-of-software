package com.mengma.instance.factory;

public class MyBeanFactory {
    public MyBeanFactory() {
        System.out.println("person3 factorying");
    }

    public Person3 createBean() {
        return new Person3();
    }
}
