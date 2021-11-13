
package com.paytmmoney.errordb.controller;

import com.paytmmoney.errordb.repository.BeanTest;

import com.paytmmoney.errordb.repository.User;
import com.paytmmoney.errordb.service.BeanService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/error")
//@Service
public class SystemErrorController {

    /*@Autowired
    private BeanTest beanTest;*/


    /*@PostMapping(path = "/adderror")
    public String addEmployee(@RequestBody SystemErrorsRedis error)
    {
        redisErrorRepository.save(error);
        return("Error added");
    }*/

    @Autowired
    private BeanService beanService;

    @Autowired
    private static ApplicationContext applicationContext;



    @GetMapping(path = "/testBO")
    public void testBO() {
        System.out.println("In /test method");
        beanService.printBO();
        //user.message();
        //beanTest.message();
    }
    @GetMapping(path = "/testBSE")
    public void testBSE() {
        System.out.println("In /test method");
        beanService.printBSE();
        //user.message();
        //beanTest.message();
    }
}





