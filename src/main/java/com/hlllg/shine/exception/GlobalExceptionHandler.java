package com.hlllg.shine.exception;

import com.hlllg.shine.common.BaseResponse;
import com.hlllg.shine.common.ErrorCode;
import com.hlllg.shine.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 何国亮
 * @version 1.0
 * @Date 2024/3/5 16:25
 *
 * 全局异常处理器
 */
@RestControllerAdvice //编写全局异常处理器（利用 Spring AOP，在调用方法前后进行额外的处理）
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("businessException: " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(RuntimeException e) {
        log.error("runtimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    }
}
