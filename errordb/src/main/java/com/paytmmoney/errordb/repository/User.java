package com.paytmmoney.errordb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private BeanTest beanTest;



    public User(BeanTest beanTest){

        this.beanTest=beanTest;
    }

    public void message()
    {

        beanTest.message();
    }


    public User() {

        //System.out.println("user create... hashCode :" + this.hashCode());
    }
}
