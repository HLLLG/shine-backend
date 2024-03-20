package com.hlllg.shine.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * @author hlllg
 * @Date 2024/3/19 13:48
 */
@SpringBootTest
public class RedisTest {

    @Resource
    RedisTemplate redisTemplate = new RedisTemplate();

    @Resource
    StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();

//    @Test
//    public void test() {
//        ValueOperations valueOperations = redisTemplate.opsForValue();
//        // 增
//        valueOperations.set("hlString", "cat");
//        valueOperations.set("hlInt", 1);
//
//        // 查
//        Object hl = valueOperations.get("hlString");
//        Assertions.assertTrue("cat".equals(hl));
//        hl = valueOperations.get("hlInt");
//        Assertions.assertTrue(1 == (Integer) hl);
//    }
}
