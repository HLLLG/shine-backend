package com.hlllg.shine.exception;

import com.hlllg.shine.common.ErrorCode;

/**
 * @author 何国亮
 * @version 1.0
 * @Date 2024/3/5 16:05
 *
 * 自定义异常类
 */
public class BusinessException extends RuntimeException{

    /**
     * 异常编码
     */
    private int code;

    /**
     * 异常描述
     */
    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
