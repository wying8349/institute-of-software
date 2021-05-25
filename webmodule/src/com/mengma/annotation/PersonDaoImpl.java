package com.mengma.annotation;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
    @Override
    public void add() {
        System.out.println("add() in Dao is executed...");
    }
}
