package com.zhouzhou.admin.exceprion;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 周万宁
 * @className GlobalExceptionHandler
 * @create 2023/1/5-6:31
 * @description
 * 处理整个web controller的异常
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler({ArithmeticException.class,NullPointerException.class})
    public String handleArithException(Throwable e){//处理异常

        log.error("异常是:{}",e);
        return "login";
    }
}
