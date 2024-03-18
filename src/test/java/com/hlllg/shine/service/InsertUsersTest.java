package com.hlllg.shine.service;

import com.hlllg.shine.model.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

/**
 * @author hlllg
 * @Date 2024/3/17 21:28
 */
@SpringBootTest
public class InsertUsersTest {
    @Resource
    private UserService userService;

    /**
     * 批量插入用户
     */
    @Test
    public void doInsertUsers() {
        final int INSERT_NUM = 1000;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < INSERT_NUM; i++) {
            User user = new User();
            user.setUsername("假HL");
            user.setUserAccount("fakehl");
            user.setAvatarUrl("https://tse1-mm.cn.bing.net/th/id/OIP-C.toKOWrSt5XUBr7CK7e1eKgHaNu?w=183&h=340&c=7&r=0&o=5&cb=11&dpr=1.3&pid=1.7");
            user.setGender(0);
            user.setUserPassword("12345678");
            user.setPhone("3123124");
            user.setEmail("312@qq.com");
            user.setUserStatus(0);
            user.setUserRole(0);
            user.setPlanetCode("1111111");
            user.setTags("[]");
            users.add(user);
        }
        userService.saveBatch(users, 20);
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }

    /**
     * 并发批量插入用户
     */
    @Test
    public void doConcurrencyInsertUsers() {
        final int INSERT_NUM = 100000;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        // 分十组
        int j = 0;
        ArrayList<CompletableFuture<Void>> fu = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<User> users = new ArrayList<>();
            while (true) {
                j++;
                User user = new User();
                user.setUsername("假HL");
                user.setUserAccount("fakehl");
                user.setAvatarUrl("https://tse1-mm.cn.bing.net/th/id/OIP-C.toKOWrSt5XUBr7CK7e1eKgHaNu?w=183&h=340&c=7&r=0&o=5&cb=11&dpr=1.3&pid=1.7");
                user.setGender(0);
                user.setUserPassword("12345678");
                user.setPhone("3123124");
                user.setEmail("312@qq.com");
                user.setUserStatus(0);
                user.setUserRole(0);
                user.setPlanetCode("1111111");
                user.setTags("[]");
                users.add(user);
                if (j % 100000 == 0) {
                    break;
                }
            }
            CompletableFuture.runAsync(() -> {
                userService.saveBatch(users, 10000);
            });

        }
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }
}
