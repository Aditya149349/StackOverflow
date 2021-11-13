/*
package com.paytmmoney.errordb.service.implementation;

import com.paytmmoney.equities.bo.commonuser.entity.UserSystem;
//import com.paytmmoney.errordb.entity.SystemErrors;
import com.paytmmoney.errordb.repository.ErrorRepository;
import com.paytmmoney.errordb.service.SystemErrorInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import java.sql.Timestamp;

//import javax.annotation.PostConstruct;
import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@Service
public class SystemErrorImplementation implements SystemErrorInt {

    @Autowired
    private ErrorRepository errorRepository;


    //private static final UserSystem userSystem = UserSystem.DEPOSITORY;

    String errorMessage = "Read timed out";
    String errorMessage2 = "ABC";

    //@PostConstruct
    @Override
    public List<SystemErrors> getSystemError() {

        List<SystemErrors> systemError = errorRepository.findBySystemName(UserSystem.DEPOSITORY);
        //System.out.println(systemError);
        for(SystemErrors errors: systemError ) {
            if (StringUtils.containsIgnoreCase(errors.getErrorMessage(), errorMessage)) {
                Date retryAfter = DateUtils.addMinutes(new Timestamp(System.currentTimeMillis()), errors.getRetryAfterTime());
                System.out.println("Error exists, retry after: " + retryAfter);
            } */
/*else
            {
                System.out.println("Error is not retryable");
            }*//*

            //System.out.println(errors.getErrorMessage());
        }
        return null;
        //System.out.println(systemError.getErrorMessage());
    }


   */
/*@Override
    public void addSystemError(SystemErrors error){
        errorRepository.save(error);
    }*//*



}
*/
