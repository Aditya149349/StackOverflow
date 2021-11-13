package com.paytmmoney.errordb.service;

import com.paytmmoney.errordb.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BeanService {

    @Autowired
    @Qualifier("boTimeOut")
    private User boUser;

    @Autowired
    @Qualifier("BSETimeout")
    private User bseUser;

    public void printBO()
    {
        boUser.message();

    }
    public void printBSE()
    {
        bseUser.message();
    }

}
