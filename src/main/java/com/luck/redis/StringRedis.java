package com.luck.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Hua wb on 2018/8/26.
 */
@Repository
public class StringRedis {
    @Autowired
    RedisTemplate<String, String> redisTemplate;

    public void add(String key, String value){
        redisTemplate.opsForValue().set(key,value);
    }
    public String get(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
