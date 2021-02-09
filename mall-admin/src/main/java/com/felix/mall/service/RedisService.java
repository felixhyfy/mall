package com.felix.mall.service;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.service
 * @className RedisService
 * @description Redis缓存类Service 使用json存储数据
 * @date 2021/1/30 13:47
 */
public interface RedisService {

    /**
     * 存储数据
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 获取数据
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置过期时间
     * @param key
     * @param expire
     * @return
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     * @param key
     * @return
     */
    Boolean remove(String key);

    /**
     * 批量删除数据
     * @param keys
     * @return
     */
    Long remove(List<String> keys);

    /**
     * 自增操作
     * @param key
     * @param delta 自增步长
     * @return
     */
    Long increment(String key, long delta);


}
