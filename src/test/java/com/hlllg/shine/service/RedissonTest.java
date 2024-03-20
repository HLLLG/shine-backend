package com.hlllg.shine.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hlllg.shine.model.domain.User;
import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author hlllg
 * @Date 2024/3/19 19:41
 */
@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

//    @Test
//    public void test() {
//        // 数据存在redis内存中
//        RList<String> rlist = redissonClient.getList("test-list");
//        rlist.add("hl");
//        System.out.println(rlist.get(0));
//        rlist.remove(0);
//    }
//
//    @Test
//    public void testWatchDog() {
//        RLock lock = redissonClient.getLock("shine:precachejob:docache:lock");
//        try {
//            // 只有一个线程能获取锁
//            if (lock.tryLock(0L, -1, TimeUnit.MILLISECONDS)) {
//                Thread.sleep(5000000);
//                System.out.println("getLock: " + Thread.currentThread().getId());
//            }
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if (lock.isHeldByCurrentThread()) {
//                lock.unlock();
//            }
//        }
//    }
}
