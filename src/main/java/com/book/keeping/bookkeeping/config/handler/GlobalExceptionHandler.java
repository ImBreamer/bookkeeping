package com.book.keeping.bookkeeping.config.handler;

import com.book.keeping.bookkeeping.common.exception.TokenInvalidException;
import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.common.result.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理配置
 * @author zhang.penghao
 * @date 2018/12/11 11:37
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 参数验证异常拦截
     * @author zhang.penghao
     * @date 2018/12/11 11:37
     * */
    @ExceptionHandler(value=MethodArgumentNotValidException.class)
    @ResponseBody
    public Result handlerViolationException(MethodArgumentNotValidException e){
        return Result.error(ResultEnum.FAIL_ERROR_PARAM, e.getBindingResult().getFieldError().getDefaultMessage());
    }

    /**
     * 自定义异常处理
     * @author zhang.penghao
     * @date 2018/12/11 11:37
     * */
    @ExceptionHandler(value=TokenInvalidException.class)
    @ResponseBody
    public Result handlerTokenInvalidException(){
        return Result.error(ResultEnum.FAIL_ERROR_TOKEN);
    }

    /**
     * 系统全局异常处理
     * @author zhang.penghao
     * @date 2018/12/11 11:37
     * */
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Result handlerException(){
        return Result.error(ResultEnum.FAIL_ERROR_UNKNOWN);
    }
}
