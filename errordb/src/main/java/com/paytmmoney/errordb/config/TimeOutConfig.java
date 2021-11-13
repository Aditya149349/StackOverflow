package com.paytmmoney.errordb.config;
import com.paytmmoney.errordb.repository.BeanTest;
import com.paytmmoney.errordb.repository.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
public class TimeOutConfig {

    @Value("${value1}")
    private int value1;

    @Value("${value2}")
    private int value2;

    @Bean()
    User boTimeOut() {
        System.out.println("In BOTimeOutConfig");
        BeanTest b1 = new BeanTest(value1, value2);
        User u1 = new User(b1);
        return u1;
    }


    @Value("${value3}")
    private int value3;

    @Value("${value4}")
    private int value4;

    @Bean(name = "BSETimeout")
    User getBSEUser() {
        System.out.println("In BSETimeOutConfig");
        User u2 = new User( new BeanTest(value3, value4));
        return u2;
    }

}
