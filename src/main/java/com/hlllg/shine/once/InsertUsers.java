package com.hlllg.shine.once;
import java.util.Date;

import com.hlllg.shine.mapper.UserMapper;
import com.hlllg.shine.model.domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hlllg
 * @Date 2024/3/17 21:16
 */
@Component
public class InsertUsers {

    @Resource
    private UserMapper userMapper;

    public void doInsertUsers() {
        final int INSERT_NUM = 1000;
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
            userMapper.insert(user);
        }
    }
}
