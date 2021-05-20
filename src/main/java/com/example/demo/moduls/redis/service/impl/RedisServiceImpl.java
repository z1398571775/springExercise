package com.example.demo.moduls.redis.service.impl;

import com.example.demo.moduls.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    RedisTemplate redisTemplate;
    @Override
    public void addString(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public boolean deleteString(String key) {
        return redisTemplate.delete(key);
    }
}
