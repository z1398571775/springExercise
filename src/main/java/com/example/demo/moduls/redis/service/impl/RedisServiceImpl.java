package com.example.demo.moduls.redis.service.impl;

import com.example.demo.moduls.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    StringRedisTemplate stringTemplate;
    @Override
    public void addString(String key, String value) {
        stringTemplate.opsForValue().set(key,value);
    }
}
