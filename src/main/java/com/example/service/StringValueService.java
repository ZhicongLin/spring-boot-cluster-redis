package com.example.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

/**
 * Created by zc.lin on 2017/4/7.
 */
@Service
public class StringValueService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public void test(){
        this.stringRedisTemplate.opsForValue().set("test", "1123dsfg1");
        this.stringRedisTemplate.opsForValue().set("test2", "1123dsf2g1");
        System.out.println(this.stringRedisTemplate.opsForValue().get("test"));
        System.out.println(this.stringRedisTemplate.opsForValue().get("test2"));
    }

}
