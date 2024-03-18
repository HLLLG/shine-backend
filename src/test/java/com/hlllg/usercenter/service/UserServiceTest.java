package com.hlllg.usercenter.service;

import com.hlllg.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 何国亮
 * @version 1.0
 * @Date 2024/3/2 15:09
 * 用户测试
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(0L);
        user.setUsername("cathl");
        user.setUserAccount("123");
        user.setAvatarUrl("https://tse2-mm.cn.bing.net/th/id/OIP-C.YeEKuzG-cVORX2VQrQd1QgHaEo?w=303&h=189&c=7&r=0&o=5&dpr=1.3&pid=1.7");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("123");


        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertEquals(true ,result);
    }

    @Test
    void userRegister() {
        String userAccount = "hlll";
        String userPassword = "";
        String checkPassword = "123456";
        String planetCode = "31919";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "hl";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "hlll";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "hl lg";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "hlllg";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "hlll";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
    }
}