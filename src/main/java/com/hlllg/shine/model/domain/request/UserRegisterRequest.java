package com.hlllg.shine.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 何国亮
 * @version 1.0
 * @Date 2024/3/2 19:48
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -92686408154719480L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;

}

