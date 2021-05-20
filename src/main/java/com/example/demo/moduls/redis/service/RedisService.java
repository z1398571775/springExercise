package com.example.demo.moduls.redis.service;

/***
 * 操作redis接口
 */
public interface RedisService {

    /***
     * Redis 字符串操作
     */
    /***
     * 添加字符串
     * @param key
     * @param value
     */
    void addString(String key,String value);

    /***
     * 根据key删除对应的值
     * @param key
     */
    boolean deleteString(String key);
}
