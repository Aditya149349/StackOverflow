/*
package com.paytmmoney.errordb.repository;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paytmmoney.equities.bo.commonuser.entity.SystemRetryableError;
import com.paytmmoney.equities.bo.commonuser.entity.UserSystem;
import com.paytmmoney.equities.bo.commonuser.repository.SystemErrorRepository;

import com.paytmmoney.errordb.exception.RedisException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class RedisErrorTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private SystemErrorRepository systemErrorRepository;

    private String generalLog = "RetryableErrorRepository";

    ObjectMapper mapper = new ObjectMapper();

    public boolean keyExists(UserSystem system)
    {
        boolean exists = stringRedisTemplate.hasKey(system.toString());
        return exists;
    }

    public List<SystemRetryableError> getValue(UserSystem key) throws RedisException {

        try {
            String map = stringRedisTemplate.opsForValue().get(key.toString());
            if (map==null) {
                //log.info("no keys found");
                return new ArrayList<SystemRetryableError>();
            }
            List<SystemRetryableError> myList= mapper.readValue(map, new TypeReference<List<SystemRetryableError>>(){});
            return myList;
        }
        catch (Exception ex)
        {
            String errorMessage = String.format("%s in method ==>(getValue) ==> Some error occurred while getting values from redis for key :: %s for exception :: %s",generalLog,key,ex.toString());
            log.error(errorMessage,ex);
            throw new RedisException(errorMessage);
        }
    }


    public void saveSystemErrorInRedis(List<SystemRetryableError> systemErrorList, UserSystem system) {
        String arrayToJson = null;
        try {
            arrayToJson = mapper.writeValueAsString(systemErrorList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        stringRedisTemplate.opsForValue().set(system.toString(), arrayToJson);

    }


    public void refreshRedis() {

        List<SystemRetryableError> newValue = new ArrayList<>();

        for (UserSystem systemName : UserSystem.values()) {
            newValue = systemErrorRepository.findBySystemNameAndActive(systemName, true);

                //newValue = mapper.convertValue(systemErrorMap, new TypeReference<List<SystemErrorsRedis>>(){});
            saveSystemErrorInRedis(newValue, systemName);
            newValue.clear();
        }


    }


}

*/
