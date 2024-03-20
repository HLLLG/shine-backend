package com.hlllg.shine.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 何国亮
 * @version 1.0
 * @Date 2024/3/2 19:48
 * 用户登录请求体
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -7882406678180100231L;

    private String userAccount;

    private String userPassword;
}

