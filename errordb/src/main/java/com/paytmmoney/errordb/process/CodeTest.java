/*
package com.paytmmoney.errordb.process;

import com.paytmmoney.equities.bo.commonuser.entity.Segment;
import com.paytmmoney.equities.bo.commonuser.entity.SystemRetryableError;
import com.paytmmoney.equities.bo.commonuser.pojo.RetryErrorInfo;
import com.paytmmoney.equities.bo.commonuser.pojo.RetryIdentificationInfo;
import com.paytmmoney.equities.bo.commonuser.repository.SegmentRepository;
import com.paytmmoney.equities.bo.commonuser.repository.SystemErrorRepository;
import com.paytmmoney.equities.bo.commonuser.util.RetryableErrorHandler;
import com.paytmmoney.equities.bo.commonuser.util.RetryableErrorIdentifier;
import com.paytmmoney.errordb.exception.RedisException;
import com.paytmmoney.errordb.repository.RedisErrorTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CodeTest {

    @Autowired
    private RetryableErrorHandler retryableErrorHandler;

    @Autowired
    private SegmentRepository segmentRepository;

    @Autowired
    private SystemErrorRepository systemErrorRepository;

    @Autowired
    private RedisErrorTest redisErrorTest;

    @PostConstruct
    public void test() throws RedisException {
        Collection<RetryableErrorIdentifier> servicesToBeChecked = retryableErrorHandler.getSystemRetryableErrorIdentifierMap().values();
        redisErrorTest.refreshRedis();
        RetryIdentificationInfo retryIdentificationInfo = new RetryIdentificationInfo();
        List<Segment> segments = segmentRepository.findByProcessEquityModelUserId(BigInteger.valueOf(10005));
        Segment segment = segments.get(0);
        for (RetryableErrorIdentifier retryableClass : servicesToBeChecked) {
            RetryErrorInfo retryErrorInfo = retryableClass.checkErrorExists(segment);
            if (retryErrorInfo.isErrorExist()) {
                if(redisErrorTest.keyExists(retryErrorInfo.getUserSystem()) == false) {
                    redisErrorTest.refreshRedis();
                }
                List<SystemRetryableError> retryableError = redisErrorTest.getValue(retryErrorInfo.getUserSystem());
                retryIdentificationInfo = retryableErrorHandler.isErrorRetryable(retryErrorInfo.getErrorMessage(),retryErrorInfo.getUserSystem(), retryableError);

            }
        }
        System.out.println(retryIdentificationInfo.isRetryable());
        System.out.println(retryIdentificationInfo.getRetryAfter());
    }

    */
/*@PostConstruct
    public void test(){
        Collection<RetryableErrorIdentifier> servicesToBeChecked = retryableErrorHandler.getSystemRetryableErrorIdentifierMap().values();
        RetryIdentificationInfo retryIdentificationInfo = new RetryIdentificationInfo();
        List<Segment> segments = segmentRepository.findByProcessEquityModelUserId(BigInteger.valueOf(33779));
        Segment segment = segments.get(1);
        for (RetryableErrorIdentifier retryableClass : servicesToBeChecked) {
            RetryErrorInfo retryErrorInfo = retryableClass.checkErrorExists(segment);
            if (retryErrorInfo.isErrorExist()) {
                List<SystemRetryableError> retryableError = new ArrayList<>();
                retryIdentificationInfo = retryableErrorHandler.isErrorRetryable(retryErrorInfo.getErrorMessage(),retryErrorInfo.getUserSystem(), retryableError);

            }
        }
        System.out.println(retryIdentificationInfo.isRetryable());
        System.out.println(retryIdentificationInfo.getRetryAfter());
    }*//*


}

*/
